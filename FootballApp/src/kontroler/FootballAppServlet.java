package kontroler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessService.SportsMetode;

/**
 * Servlet implementation class FootballAppServlet
 */
@WebServlet(description = "Ovo je servlet za aplikaciju", urlPatterns = { "/FootballAppServlet" })
public class FootballAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sportsName = request.getParameter("SportName");
				
		SportsMetode metode = new SportsMetode();
		if(metode.ubaciSport(sportsName)) {
			response.sendRedirect("index.html");
		} else {
			response.sendRedirect("index.html");
	}

 }
}
