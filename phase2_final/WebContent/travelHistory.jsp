<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.admin.Logindetails" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<% 
		String mail = request.getParameter("email");
		String password = request.getParameter("password");
		Logindetails admin = new Logindetails();
		int res = admin.verifyLogin(mail, password);
		if(res==0){
			System.out.println("Wrong credentials, try again!!");
			response.sendRedirect("sessionHandling.jsp");
		}
	%>
	<h2>Welcome to travel history page</h2> <br>
	
	<a href="show_flightdetails.jsp">Show flight schedule</a> <br>
	<a href="show_bookingdetails.jsp"> Show booking details</a> <br>
	
	<form action="userHistory.jsp" method="post">
		Enter email of user : <input type="text" name="uname">
		<input type="submit" value="Search">
	</form>
	
</body>
</html>