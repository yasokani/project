<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		String mobile = request.getParameter("mobile");
		String mail = request.getParameter("mail");
		String country = request.getParameter("country");
		String identity = request.getParameter("identity");
		String identity_no = request.getParameter("identityno");
		
		int flight_no = (Integer)session.getAttribute("fno");
		pageContext.setAttribute("flight_no", flight_no);
		String noOfPerson = (String)session.getAttribute("noOfPersons");
		int noOfPersons = Integer.parseInt(noOfPerson);
		pageContext.setAttribute("noOfPersons", noOfPersons);
		
		session.setAttribute("username", name);
	%>
	
	<h2 align="center">Review your details and Submit</h2>
	
	<table border = "1" width="60%" align="center">
		<tr>
			<td> Name </td>
			<td> <%=name %></td>
		</tr>
		<tr>
			<td> Address </td>
			<td> <%=address %></td>
		</tr>
		<tr>
			<td> Age </td>
			<td> <%=age %></td>
		</tr>
		<tr>
			<td> Mobile number </td>
			<td> <%=mobile %></td>
		</tr>
		<tr>
			<td> Mail Id </td>
			<td> <%=mail %></td>
		</tr>
		<tr>
			<td> Country </td>
			<td> <%=country %></td>
		</tr>
		<tr>
			<td> <%=identity %> </td>
			<td> <%=identity_no %></td>
		</tr>
	</table>
	
	<h2 align="center">Flight details</h2>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>  
	
	<sql:query var="rs" dataSource="${db}">
		select * from flight_details where flight_no=?;
		<sql:param value="${flight_no}"></sql:param>
	</sql:query>
	
	<c:forEach var="row" items="${rs.rows}">
		<c:set var="flight_no" value="${row.flight_no}"></c:set>
		<c:set var="price" value="${row.price}"></c:set>
		<c:set var="airline_name" value="${row.airline_name}"></c:set>
		<c:set var="from_city" value="${row.from_city}"></c:set>				
		<c:set var="dest_city" value="${row.dest_city}"></c:set>
		<c:set var="depart_time" value="${row.depart_time}"></c:set>
		<c:set var="arrival_time" value="${row.arrival_time}"></c:set>
		<c:set var="travel_date" value="${row.travel_date}"></c:set>
		<c:set var="bclass" value="${row.bclass}"></c:set>
	</c:forEach>
	
	<table border = "1" width="60%" align="center">
		<tr>
			<td> Airline Name </td>
			<td> <c:out value="${airline_name}"></c:out>
		</tr>
		<tr>
			<td> Flight Number </td>
			<td> <c:out value="${flight_no}"></c:out>
		</tr>
		<tr>
			<td> Price per seat </td>
			<td> <c:out value="${price}"></c:out>
		</tr>
		<tr>
			<td> Source city </td>
			<td> <c:out value="${from_city}"></c:out>
		</tr>
		<tr>
			<td> Destination city </td>
			<td> <c:out value="${dest_city}"></c:out>
		</tr>		
		<tr>
			<td> Departure Time </td>
			<td> <c:out value="${depart_time}"></c:out>
		</tr>
		<tr>
			<td> Arrival Time </td>
			<td> <c:out value="${arrival_time}"></c:out>
		</tr>
		<tr>
		<td> Travel Date </td>
			<td> <c:out value="${travel_date}"></c:out>
		</tr>
		<tr>
			<td> Flight class </td>
			<td> <c:out value="${bclass}"></c:out>
		</tr>		
	</table>
	
	<form action="payment.jsp" method="post">
	<input type="hidden" value="${price}" name="tprice">
	<h4 style="color:red" align="center"> Review and click here for  <b><input type="submit" value="Payment"></b></h4>
	</form>
</body>
</html>