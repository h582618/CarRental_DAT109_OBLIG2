package Servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dataModels.*;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();

		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		if (session.getAttribute("choosenCar") == null) {
			response.sendRedirect("/OrderPageServlet");
			return;
		}
		request.getRequestDispatcher("WEB-INF/registerPage.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		
		ServletContext sc = request.getServletContext();
		HttpSession session = request.getSession();
		List<Car> cars = (ArrayList<Car>) sc.getAttribute("cars");
		Car choosenCar = null;
		CarRental carRental = (CarRental) sc.getAttribute("carRental");
		List<Office> offices = carRental.getOffices();

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String streetAddress = request.getParameter("streetAddress");
		int postalCode = Integer.parseInt(request.getParameter("postalCode"));
		String postalPlace = request.getParameter("postalPlace");
		int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
		String ccNumber = request.getParameter("ccNumber");
		String ccDate = request.getParameter("ccDate");
		int ccv = Integer.parseInt(request.getParameter("ccV"));
		String licenseNumber = request.getParameter("licenseNumber");
		int returnOfficeNumber = Integer.parseInt(request.getParameter("returnOffice"));
		
		Office pickupOffice = (Office)session.getAttribute("pickupOffice");
		LocalDate pickupDate = (LocalDate)session.getAttribute("pickupDate");
		LocalDate returnDate = (LocalDate)session.getAttribute("returnDate");
		
		if (licenseNumber != "" && cars != null) {
			
			//Her hadde jeg brukt finnbil metode i dao.
			choosenCar = cars.stream().filter(x -> x.getLicenseNumber().equals(licenseNumber)).findFirst()
					.orElseThrow();
		};

		Office returnOffice = offices.stream().filter(x -> x.getOfficeNumber() == returnOfficeNumber).findFirst()
				.orElseThrow();	
		// Veldig enkel valdiering, i realtiteten hadde vi gjort dette mye mer
		// omfattende.
		if (firstName != "" && lastName != "" && streetAddress != "" && postalCode != 0 && postalPlace != ""
				&& phoneNumber != 0 && ccNumber != "" && ccDate != "" && ccv != 0 && licenseNumber != ""
				&& returnOffice != null && pickupOffice != null
				&& pickupDate.compareTo(returnDate) < 0 ) {
			
			Reservation reservation = new Reservation(
					new Customer(firstName, lastName, new Address(streetAddress, postalCode, postalPlace), phoneNumber),
					new Card(ccNumber, ccv, ccDate), licenseNumber, choosenCar.getKm(), pickupDate, pickupOffice,
					returnDate, returnOffice);
			choosenCar.setAvailable(false, reservation);
			sc.setAttribute(licenseNumber+"Res", reservation);
			session.setAttribute("reservation", reservation);

			request.getRequestDispatcher("WEB-INF/confirmation.jsp").forward(request, response);
		}
		else {
			response.sendRedirect("RegisterServlet");
			
		}
		
	}

}
