<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String username = (String)session.getAttribute("username");
		session.invalidate();
	%>
	
	<center><h2 >Thank you Kanimozhi for booking with us !!</h2> <br></center>
	Enjoy your movie!!! 
</body>
</html>