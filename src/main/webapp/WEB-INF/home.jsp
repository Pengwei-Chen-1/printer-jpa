<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Printer List</title>
</head>
<body>
	<h1>All Persons</h1>
	<c:forEach var="p" items="${printers}">
		Id: ${p.printerId} Name: ${p.printerName}<br />
	</c:forEach>

	<h1>Add New</h1>
	<form method="post" action="addPerson">
		Name: <input type="text" name="name" />
		<button>Add</button>
	</form>
</body>
</html>