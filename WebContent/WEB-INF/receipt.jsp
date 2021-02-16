<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GuttaCorp Rental</title>
</head>
<body>
<h3> Receipt</h3>
<p> Car returned : ${returnedCar.brand}</p>
<p> Total km: ${totalKM} </p>
<p> Total price : ${totalAmount} kr </p>
<button onclick="location.href='HomePageServlet'" type="button">
        Home </button>
</body>
</html>