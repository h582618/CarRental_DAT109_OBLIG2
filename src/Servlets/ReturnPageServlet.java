package Servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dataModels.Car;


@WebServlet("/ReturnPageServlet")
public class ReturnPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/returnPage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = request.getServletContext();
		
		List<Car> cars = (List<Car>) sc.getAttribute("totalCars");
		
		String licencePlate = request.getParameter("licencePlate");
		
		String returnDate = request.getParameter("returnDate");
		
		int returnKM = Integer.parseInt(request.getParameter("returnKM"));
		
		Car returnedCar = cars.stream().filter(x -> x.getLicenseNumber().toUpperCase().equals(licencePlate)).findFirst()
		.orElseThrow();
		
		int totalAmount = returnedCar.reservation.amount(LocalDate.parse(returnDate), returnedCar.dayPrice);
		
		int totalKM = returnKM - returnedCar.getKm();
		
		returnedCar.setKm(returnKM);
				
		returnedCar.setAvailable(true,null);
		
		sc.setAttribute("cars", cars);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("returnedCar", returnedCar);
		session.setAttribute("totalKM", totalKM);
		session.setAttribute("totalAmount", totalAmount);
		
		response.sendRedirect("ReceiptServlet");
		
	}

}
