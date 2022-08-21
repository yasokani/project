<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Welcome to flight registration</h2>
	<form action="searchFlights.jsp" method="post">
		<table>
			<tr>
				<td> Enter username</td>
				<td> <input type="text" name="mail" required> </td>
			</tr>
			<tr>
				<td> Enter password </td>
				<td> <input type="password" name="password" required>
			</tr>
			<tr>
				<td> <input type="submit" value="Review"> </td>
			</tr>
		</table>
	</form>
</body>
</html>