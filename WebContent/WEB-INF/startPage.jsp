<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post">
	<fieldset>
		<label for="pickupOffice"> Location:</label> 
		<select name="pickupOffice"> 
			<option value="Gardemoen"> Gardemoen </option>
			<option value="Flesland"> Flesland </option>
		</select>
		
		<p> <input type="date" name="pickupDate" /> Pickup date</p>
		<p> <input type="date" name="returnDate" /> Return date </p>
		<select  name="group">
		 		<option value ="0" selected>Show all</option>
		        <option value ="1">Sedan</option>
		        <option value ="2">SUV</option>
		        <option value ="3">COUPE</option>
		</select>
		<button type="submit">Submit</button>
	</fieldset>
</form>
</body>
</html>