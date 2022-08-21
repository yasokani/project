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
		int price = Integer.parseInt(request.getParameter("tprice"));
		int noOfPersons = Integer.parseInt((String)session.getAttribute("noOfPersons"));
		
//		int price = 5;
	//	int noOfPersons = 3;	
		int total = price * noOfPersons;
	%>
	<h2 align="center">Payment page</h2> <br> <br>
	<h3 align="center" style="color:red">Scan this QR Code to pay </h3>
	<img src="https://www.business2community.com/wp-content/uploads/2012/04/Picture-21.png" width="300px" height="300px" alt="qr code">
	<h3 align="center" style="color:red">Amount to be paid Rs. <b><%=total %></b></h3>
	
	<p align="center">Click here to <a href="logout.jsp">Pay</a></p>
</body>
</html>