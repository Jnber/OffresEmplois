package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CondidatureService;
import dao.ContactService;
import metier.Condidature;
import metier.Contact;
import metier.User;

/**
 * Servlet implementation class AddCondidature
 */
@WebServlet("/AddCondidature")
public class AddCondidature extends HttpServlet {
private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession(false);
        User user = (User) httpSession.getAttribute("user");
        if(
        		user != null && user.getRole()==0
        		) {
            req.getRequestDispatcher("AddCondidature.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("allOffers").forward(req,resp);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String tel = req.getParameter("tel");
	        String dateNaissence = req.getParameter("dateNaissence");
	        String ville = req.getParameter("ville");
	        String niveauEtude = req.getParameter("niveauEtude");
	        String niveauExp = req.getParameter("niveauExp");
	        String cv = req.getParameter("cv");
	        String id_offre = "1";
	        String id_utili = "1";
	        System.out.println("got");
	        Condidature offre = new Condidature();
	        offre.setTel(tel);
	        offre.setDatenaissence(dateNaissence);
	        offre.setVille(ville);
	        offre.setNiveauEtude(niveauEtude);
	        offre.setNiveauExp(niveauExp);
	        offre.setCv(cv);
	        offre.setid_offre(Integer.parseInt(id_offre));
	        offre.setid_utili(Integer.parseInt(id_utili));	
	        
	        System.out.println("created offer");
	        CondidatureService offreService = new CondidatureService();
	        System.out.println("created offre service");
	        offreService.saveCondidature(offre);
	        System.out.println("saved");
	        resp.sendRedirect("Home");
	    }

}
