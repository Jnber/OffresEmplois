package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserService;
import metier.User;

/**
 * Servlet implementation class addUser
 */
@WebServlet("/addUser")
public class addUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession(false);
        User user = (User) httpSession.getAttribute("user");
        if(user == null || user.getRole() == 1 ) {
            req.getRequestDispatcher("AddUser.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("Home").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 HttpSession httpSession = req.getSession(false);
         User userr = (User) httpSession.getAttribute("user");
        String firstName = req.getParameter("nom");
        String lastName = req.getParameter("prenom");
        String email = req.getParameter("email");
        String password = req.getParameter("pass");

        User user = new User();
        user.setNom(firstName);
        user.setPrenom(lastName);
        user.setEmail(email);
        user.setPass(password);
        UserService userService = new UserService();
        userService.saveUser(user);
        if(userr == null || userr.getRole() == 1 ) {
        	resp.sendRedirect("allUsers");
        }else{
            resp.sendRedirect("index.html");
        }
        
    }

}
