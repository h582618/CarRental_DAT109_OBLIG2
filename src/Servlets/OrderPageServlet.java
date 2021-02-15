package Servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dataModels.*;

/**
 * Servlet implementation class OrderPageServlet
 */
@WebServlet("/OrderPageServlet")
public class OrderPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String pickupOffice = (String)session.getAttribute("pickupOffice");
		LocalDate pickupDate = (LocalDate)session.getAttribute("pickupDate");
		LocalDate returnDate = (LocalDate)session.getAttribute("returnDate");
		int group = (int)session.getAttribute("group");
		
		//I virkeligheten hadde vi hatt dette lagret i en database, men lager det her for å gjøre det lett.
		Car Maserati = new Car("MM","Maserati","Black",15000,3,true,1,"https://cdn.motor1.com/images/mgl/6gXgr/s1/maserati-ghibli-ribelle.jpg");
		Car BMWE87 = new Car("SU33007","BMW","RED",200000,1,true,2,"https://www.1addicts.com/forums/attachment.php?attachmentid=220971&stc=1&d=1140646494");
		Car RangeRover = new Car("DAT109","Range Rover","Black",25000,2,true,1,"https://www.autocar.co.uk/sites/autocar.co.uk/files/range-rover-svr-rt-2015-4.jpg");
		Car TeslaX = new Car("DogeCoin","Tesla X","Blue",35000,2,true,2,"https://m.atcdn.co.uk/vms/media/w1920/b7857dadc51c4a38a730d65ddfb09e26.jpg");
		
		
		
		Office Gardemoen = new Office(1,new Address("Gardemoenveien 33",1345,"Oslo"),1234567,new ArrayList<Car>() {{
			add(Maserati);add(TeslaX);	
		}});
		
		Office Flesland = new Office(2,new Address("FleslandVeien 22",5051,"Bergen"),1234567,new ArrayList<Car>() {{
			add(BMWE87);add(RangeRover);	
		}});
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
