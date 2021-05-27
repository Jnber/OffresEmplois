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
import metier.Offre;

import dao.OffreService;
import metier.User;

/**
 * Servlet implementation class AllOffers
 */
@WebServlet(name = "all_offers",urlPatterns = {"/allOffers"})
public class AllOffers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession(false);
        User user = (User) httpSession.getAttribute("user");
        if(user != null && user.getRole()== 1) {
            OffreService articleService = new OffreService();
            String metier = req.getParameter("metier");
            List<Offre> articleList = new ArrayList<>();
            if(metier != null) {
                articleList = articleService.findByMetier(metier);
            }else{
                articleList = articleService.findAll();
            }


            req.setAttribute("allOffres",articleList);
            req.getRequestDispatcher("AllOffres.jsp").forward(req,resp);

      }else{
            req.getRequestDispatcher("Home").forward(req,resp);
        }

    }

}
