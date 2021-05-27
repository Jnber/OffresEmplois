package servlet;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserService;
import metier.User;

/**
 * Servlet implementation class allUsers
 */
@WebServlet(name = "all_users", urlPatterns = {"/allUsers"})
public class allUsers extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession httpSession = req.getSession(false);
        User user = (User) httpSession.getAttribute("user");

        if(user != null && user.getRole() == 1) {
            UserService userService = new UserService();
            List<User> userList = new ArrayList<>();
            userList = userService.findAll();

            req.setAttribute("allUsers",userList);
            req.getRequestDispatcher("AllUsers.jsp").forward(req,resp);

        }else{
            req.getRequestDispatcher("index.html").forward(req,resp);
        }
    }
}
