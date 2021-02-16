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
		<p>License number<p> <input type="text" name="licencePlate" value="" />
		<button type="submit">Return Car</button>
	</form>
</body>
</html>