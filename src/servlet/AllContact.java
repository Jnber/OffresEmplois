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

import dao.ContactService;
import metier.Contact;
import metier.User;

/**
 * Servlet implementation class AllContact
 */
@WebServlet("/AllContact")
public class AllContact extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession(false);
        User user = (User) httpSession.getAttribute("user");
        if(user != null && user.getRole()== 1) {
            ContactService articleService = new ContactService();
            String email = req.getParameter("email");
            List<Contact> articleList = new ArrayList<>();
            if(email != null) {
                articleList = articleService.findAll(email);
            }else{
                articleList = articleService.findAll();
            }


            req.setAttribute("allContacts",articleList);
            req.getRequestDispatcher("AllContact.jsp").forward(req,resp);

      }else{
            req.getRequestDispatcher("AllOffers.jsp").forward(req,resp);
        }

    }

}
