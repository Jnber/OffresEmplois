package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CondidatureService;
import dao.ContactService;
import metier.User;

/**
 * Servlet implementation class DeleteCondidature
 */
@WebServlet("/DeleteCondidature")
public class DeleteCondidature extends HttpServlet {
private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession(false);
        User user = (User) httpSession.getAttribute("user");
        if(user != null) {
            int id = Integer.parseInt(req.getParameter("id"));
            CondidatureService articleService = new CondidatureService();
            articleService.deleteCondidatureById(id);
            resp.sendRedirect("allOffers");
        }else{
            req.getRequestDispatcher("allOffers").forward(req,resp);
        }

    }
}
