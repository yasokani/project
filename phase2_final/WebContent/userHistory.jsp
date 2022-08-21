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

	<h2>Traveler history</h2>
	<%
		String mail = request.getParameter("uname");
		pageContext.setAttribute("mail", mail);
	%>
	
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>  
	
	<sql:query var="rs" dataSource = "${db}">
		select * from booking_details where username=?;
		<sql:param value="${mail}"></sql:param>
	</sql:query>
	
	<h3>Showing details for user <%=mail %></h3>
	<c:forEach var="row" items="${rs.rows}">
	
		<sql:query var="res" dataSource="${db}">
			select * from flight_details where flight_no=?;
			<sql:param value="${row.flight_no}"></sql:param>
		</sql:query>
		
		<c:forEach var="row1" items="${res.rows}">
			Airline name : <c:out value="${row1.airline_name}"></c:out> <br>
			Flight number : <c:out value="${row1.flight_no}"></c:out> <br>
			From City : <c:out value="${row1.from_city}"></c:out> <br>
			Destination : <c:out value="${row1.dest_city}"></c:out> <br>
			Departure time : <c:out value="${row1.depart_time}"></c:out> <br>
			Arrival Time : <c:out value="${row1.arrival_time}"></c:out> <br> <br>
		</c:forEach>
	</c:forEach>
</body>
</html>