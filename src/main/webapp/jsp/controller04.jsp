<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>contoller04</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
	<h1>c04 jsp</h1>
	
	<form action="${pageContext.request.contextPath}/ex04/sub02">
		<input type="submit" value="get 방식 전송">
	</form>
	
	<form
		method="post" 
		action="${pageContext.request.contextPath}/ex04/sub02">
		<input type="submit" value="post 방식 전송">
	</form>
	
	<form 
		method="get"
		action="${pageContext.request.contextPath}/ex04/sub03">
		<input type="submit" value="sub03 get">
	</form>
	
	<form 
		method="post"
		action="${pageContext.request.contextPath}/ex04/sub03">
		<input type="submit" value="sub03 post">
	</form>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>











