package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataModels.Car;


@WebServlet("/ReturnPageServlet")
public class ReturnPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/returnPage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = request.getServletContext();
		
		List<Car> cars = (List<Car>) sc.getAttribute("cars");
		
		String licencePlate = request.getParameter("licencePlate");
		
		
		cars.stream().filter(x -> x.getLicenseNumber().equals(licencePlate)).findFirst()
		.orElseThrow().setAvailable(true,null);
		
		sc.setAttribute("cars", cars);
		
		response.sendRedirect("HomePageServlet");
		
	}

}
