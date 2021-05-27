package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.OffreService;
import metier.User;

/**
 * Servlet implementation class DeleteOffre
 */
@WebServlet(name = "delete_offre",urlPatterns = {"/deleteOffre"})
public class DeleteOffre extends HttpServlet {
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
            OffreService articleService = new OffreService();
            articleService.deleteOffreById(id);
            resp.sendRedirect("allOffers");
        }else{
            req.getRequestDispatcher("index.html").forward(req,resp);
        }

    }

}
