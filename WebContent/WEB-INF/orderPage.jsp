<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GuttaCorp Rental</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<h1>Available cars</h1>
	<form method="post">
		<c:forEach items="${cars}" var="x">
			<div
				style="background-color: #cccccc; width: 400px; heigth: 300px; display: inline-block;">
				<div style="width: 200px;">
					<p>Brand : ${x.brand}</p>
					<p>Color : ${x.color}</p>
					<p>Price : ${days*x.dayPrice} kr</p>
					<input type="hidden" name="choosenCar" value="${x.licenseNumber}">
					<button type="submit">Order car</button>
				</div>
				<img src="${x.img}"
					style="width: 200px; height: 200px; float: right;">
			</div>
			<br />
			<br />
		</c:forEach>
	</form>
	<button onclick="location.href='HomePageServlet'" type="button">
        Home </button>
	
</body>
</html>