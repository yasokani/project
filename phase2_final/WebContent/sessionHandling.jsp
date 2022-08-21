<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center><h2>Welcome to flight registrations</h2>
	<h3>
		Click here to <a href="changePassword.jsp">Change Password</a>
	</h3></center>

	<form action="travelHistory.jsp" method="post">
		<table>
			<tr>
				<th>Fill Login details</th>
			</tr></br>
			<tr>
				<td>Username</td>
				<td><input type="text" name="email" placeholder="abc@gmail.com"
					required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"
					placeholder=" Password" required></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button type="submit" value="Search">
						<b>Review</b>
					</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>