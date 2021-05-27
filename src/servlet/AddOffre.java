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
 * Servlet implementation class AddOffre
 */
@WebServlet(name = "add_offre" , urlPatterns= {"/addOffre"})
public class AddOffre extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession(false);
        User user = (User) httpSession.getAttribute("user");
        	if (user != null && user.getRole()==1
        		) {
            req.getRequestDispatcher("AddOffre.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("Home").forward(req,resp);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String metier = req.getParameter("metier");
	        String titre = req.getParameter("titre");
	        String societe = req.getParameter("societe");
	        String date = req.getParameter("date");
	        String descri = req.getParameter("descri");
	        System.out.println("got");
	        Offre offre = new Offre();
	        offre.setMetier(metier);
	        offre.setTiter(titre);
	        offre.setSociete(societe);
	        offre.setDate(date);
	        offre.setDescri(descri);
	        System.out.println("created offer");
	        OffreService offreService = new OffreService();
	        System.out.println("created offre service");
	        offreService.saveOffre(offre);
	        System.out.println("saved");
	        resp.sendRedirect("allOffers");
	    }

}
