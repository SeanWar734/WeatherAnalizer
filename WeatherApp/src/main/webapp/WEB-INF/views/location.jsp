<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${area.productionCenter}</h2>

<h2>Elevation is ${area.location.elevation}</h2>
<h2>TimeZone is ${area.location.timezone}</h2>
<h2>Location is ${area.location.areaDescription}</h2>

<c:forEach var="text" items="${area.data.text}">
<h6>${text}</h6>
</c:forEach>
</body>
</html>