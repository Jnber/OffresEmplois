package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ContactService;
import dao.OffreService;
import metier.Contact;
import metier.Offre;
import metier.User;

/**
 * Servlet implementation class AddContact
 */
@WebServlet("/AddContact")
public class AddContact extends HttpServlet {
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
            req.getRequestDispatcher("contact.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("allOffers").forward(req,resp);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String email = req.getParameter("email");
	        String sujet = req.getParameter("sujet");
	        String msg = req.getParameter("msg");
	        System.out.println("got");
	        Contact offre = new Contact();
	        offre.setEmail(email);
	        offre.setSujet(sujet);
	        offre.setMsg(msg);
	    
	        System.out.println("created offer");
	        ContactService offreService = new ContactService();
	        System.out.println("created offre service");
	        offreService.saveContact(offre);
	        System.out.println("saved");
	        resp.sendRedirect("contact.jsp");
	    }

}
