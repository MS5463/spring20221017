<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>coffee</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>

	<form action="" method="post">
		이름 : 
		<select name="name">
			<c:forEach items="${coffeeList}" var="coffee">
				
				<option value="${coffee.name}">${coffee.name}</option>
			
			</c:forEach>
		</select>
		<br>
		선택 : 
		<input type="text" name="coffee">
		<br>
		<input type="submit" value="전송">
		
	</form>
	
	<ul>
		<c:forEach items="${coffeeList}" var="coffee">
			<li><b>${coffee.name}</b> : ${coffee.coffee}</li>
		</c:forEach>
	</ul>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>











