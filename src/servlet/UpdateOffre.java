package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.OffreService;
import metier.Offre;
import metier.User;

/**
 * Servlet implementation class UpdateOffre
 */
@WebServlet(name = "update_offre",urlPatterns = {"/updateOffre"})
public class UpdateOffre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession(false);
        User user = (User) httpSession.getAttribute("user");
        if(user != null && user.getRole()== 1) {
            int id = Integer.parseInt(req.getParameter("id"));
            OffreService articleService = new OffreService();
            Offre offre = articleService.FindById(id);
            req.setAttribute("offre",offre);
            req.getRequestDispatcher("UpdateOffre.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String metier = req.getParameter("metier");
        String titre = req.getParameter("titre");
        String societe = req.getParameter("societe");
        String date = req.getParameter("date");
        String descri = req.getParameter("descri");

        Offre offre = new Offre();
        offre.setMetier(metier);
        offre.setTiter(titre);
        offre.setSociete(societe);
        offre.setDate(date);
        offre.setDescri(descri);
        OffreService offreService = new OffreService();
        offreService.saveOffre(offre);
        offreService.updateOffre(offre);


        resp.sendRedirect("allOffers");
    }

}
