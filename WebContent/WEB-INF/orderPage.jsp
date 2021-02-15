<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1> </h1>
<c:forEach items="${cars}" var="x"> 
<div style="width:200px;"> 
	<td align="left">${x.brand}</td>
	<td align="left">${x.color}</td>
	<td align="left"> ${days*x.dayPrice}</td>
</div>
	<td align="left"><img src="${x.img}" style="width:200px;height:200px;"> </td>
	<br/> 
</c:forEach> 
</body>
</html>