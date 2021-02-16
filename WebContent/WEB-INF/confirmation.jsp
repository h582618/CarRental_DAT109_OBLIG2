<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GuttaCorp Rental</title>
</head>
<body>
<h1> Order confirmation</h1>
<p> Thank for your rental order of ${choosenCar.brand}, license number ${choosenCar.licenseNumber} </p>
<p> pickup location : ${reservation.pickupOffice.address.streetAddress} <p> 
<p> Delivery time: ${reservation.returnDateTime}
<button onclick="location.href='ReturnPageServlet'" type="button">
        Return car</button>
        
 <button onclick="location.href='HomePageServlet'" type="button">
        Home</button>
</body>
</html>