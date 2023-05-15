<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Heres your omikuji</title>
</head>
<body>
	<ul>
		<li><c:out value="${quantity}"/></li>
		<li><c:out value="${city}"/></li>
		<li><c:out value="${name}"/></li>
		<li><c:out value="${hobby}"/></li>
		<li><c:out value="${livingThing}"/></li>
		<li><c:out value="${comment}"/></li>
	</ul>
	<a href="/">Home</a>
</body>
</html>