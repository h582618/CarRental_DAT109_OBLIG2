<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="UTF-8">
<title>Return</title>
</head>
<body>
<h1> Return car </h1>
	<form method="post" action="ReturnPageServlet">
		<select name="licencePlate"> 
			<c:forEach items="${totalCars}" var="x">
					<option value="${x.licenseNumber}"> License number : ${x.licenseNumber}, brand: ${x.brand} </option>
			</c:forEach>
		</select>
		<p>Date <input type="date" name="returnDate" value="2021-09-29" required/> <p>
		<p>Kilometer <input type="text" name="returnKM" value="" required/> <p>
		<button type="submit">Return Car</button>
	</form>
	<button onclick="location.href='HomePageServlet'" type="button">
        Home</button>
</body>
</html>