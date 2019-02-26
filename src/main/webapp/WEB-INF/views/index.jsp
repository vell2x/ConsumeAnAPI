<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tiny List</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<p><a href="/completelist" class="btn btn-dark">Complete List</a></p>
</head>
<body>
<div class="container">
	<h1>Tiny List</h1>
	<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>Name</th><th>Invented</th><th>Year</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="l" items="${tiny}">
				<tr>
					<td>${l.name}</td>
					<td>${l.invented}</td>
					<td>${l.year}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
</body>
</html>