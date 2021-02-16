<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GuttaCorp Rental</title>
</head>
<h3> Customer information</h3>
<body>
	<form method="post" action="RegisterServlet">
		<fieldset>
			<p> First name: <input type="text"
				name="firstName" value="Ola" required/>
			</p>
			<p>  Last name: <input type="text"
				name="lastName" value="Nordmann" required/>
			 </p>
			<p> Street address:<input type="text"
				name="streetAddress" value="Nebbeveien 55" required/> 
			</p>
			<p> Postal code:<input type="text"
				name="postalCode" value="5148" required/> 
			</p>
			<p> Postal Location:<input type="text"
				name="postalPlace" value="Bergen" required/> 
			</p>
			<p> Phonenumber:<input type="text"
				name="phoneNumber" value="41564433" required/> 
			</p>
			<p> Credit card number:<input type="text"
				name="ccNumber" value="123456781234" required/> 
			</p>
			<p> Credit card date:<input type="text"
				name="ccDate" value="04/20" required/> 
			</p>
				<p> ccv:<input type="text"
				name="ccV" value="420" required/> 
			</p>
				<input type="hidden" name="licenseNumber" value="${choosenCar.licenseNumber}"
				required/> 
				<p> Return office
				<select name="returnOffice"> 
					<option value="1" selected> Gardemoen </option>
					<option value="2"> Flesland </option>
				</select>
				</p>
		<button type="submit">Submit</button>
		</fieldset>
	</form>
<br> 
<button onclick="location.href='HomePageServlet'" type="button">
        Home</button>
</body>
</html>