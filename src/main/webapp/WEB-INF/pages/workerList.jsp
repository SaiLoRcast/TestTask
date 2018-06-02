<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>List of the workers</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>

<body>
	<h2>All Workers</h2>
	<table>
		<tr>
			<th width="80">ID</th>
			<th width="120">Name</th>
			<th width="120">Phone</th>
			<th width="60">Edit</th>
			<th width="60">Delete</th>
		</tr>
		<c:forEach items="${workers}" var="worker">
			<tr>
			<td>${worker.id}</td>
			<td>${worker.name}</td>
			<td>${worker.phone}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>