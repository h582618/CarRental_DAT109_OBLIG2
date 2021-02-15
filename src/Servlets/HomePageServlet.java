package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomePageServlet
 */
@WebServlet("/HomePageServlet")
public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("WEB-INF/startPage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pickupOffice = request.getParameter("pickupOffice");
		String pickupDate = request.getParameter("pickupDate");
		String returnDate = request.getParameter("returnDate");
		String group = request.getParameter("group");
		
		HttpSession session = request.getSession();

		
		
		if(pickupOffice != "" && pickupDate != "" && returnDate != "" && group != "") {
			
			session.setAttribute("pickupOffice",pickupOffice);
			session.setAttribute("pickupDate",pickupDate);
			session.setAttribute("returnDate",returnDate);
			session.setAttribute("group",group);
			response.sendRedirect("OrderPageServlet");
			return;
			
		};
		
		request.setAttribute("aarsak", "Ugyldig input");
		response.sendRedirect("HomePageServlet");
		
	}

}
