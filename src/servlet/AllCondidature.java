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

import dao.CondidatureService;
import dao.OffreService;
import metier.Condidature;
import metier.Offre;
import metier.User;

/**
 * Servlet implementation class AllCondidature
 */
@WebServlet("/AllCondidature")
public class AllCondidature extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession(false);
        User user = (User) httpSession.getAttribute("user");
        if(user != null && user.getRole()== 1) {
            CondidatureService articleService = new CondidatureService();
            List<Condidature> articleList = new ArrayList<>();
            
                articleList = articleService.findAll();
            


            req.setAttribute("AllCondidature",articleList);
            req.getRequestDispatcher("AllCondidatures.jsp").forward(req,resp);

      }else{
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }

    }
}
