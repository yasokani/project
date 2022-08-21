<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center><h2>Welcome to Password change </h2></center>

	<form action="confirmPass.jsp" method="post">
		<table>
			<tr>
				<td>Enter email:</td>
				<td><input type="text" name="email"></td>
			</tr>

			<tr>
				<td>Enter old password:</td>
				<td><input type="password" name="oldpass"></td>
			</tr>
			<tr>
				<td>Enter new password:</td>
				<td><input type="password" name="newpass"></td>
			</tr>
			<tr>
				<td>Confirm new password:</td>
				<td><input type="password" name="confirmpass"></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button type="submit">Submit</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>