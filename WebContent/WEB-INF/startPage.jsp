<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GuttaCorp Rental</title>
</head>
<body>
<h1> GutteCorp Rental</h1>
<form method="post">
	<fieldset>
		<label for="pickupOffice"> Location:</label> 
		<select name="pickupOffice"> 
			<option value="Gardemoen"> Gardemoen </option>
			<option value="Flesland"> Flesland </option>
		</select>
		
		<p> <input type="date" value="2021-09-26" name="pickupDate" /> Pickup date</p>
		<p> <input type="date" value="2021-09-29" name="returnDate" /> Return date </p>
		
		<p> Type <select  name="group">
		 		<option value ="0" selected>Show all</option>
		        <option value ="2">SUV</option>
		        <option value ="3">COUPE</option>
		       	<option value ="1">Sedan</option>
		</select> </p> 
		<button type="submit">Search for cars</button>
	</fieldset>
</form>
<br> 
 <button onclick="location.href='ReturnPageServlet'" type="button">
     Click here to return a Car </button>
</body>
</html>