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

	<h2 align="center">Flight schedule details</h2> <br><br>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>  
	
	<sql:query var="rs" dataSource = "${db}">
		select * from flight_details;
	</sql:query>
	
	<table border = "1" width="100%">
         <tr>
            <th>Airline name</th>
            <th>Price</th>
            <th>Flight_no</th>
            <th>Source_city</th>
            <th>Dest_city</th>
            <th>Depart_time</th>
            <th>Arrival_time</th>
            <th>Total seats</th>
            <th>Booked seats</th>
            <th>Avail seats</th>
            <th>Travel date</th>
            <th>Class</th>
         </tr>
         
         <c:forEach var = "row" items = "${rs.rows}">
            <tr>
               <td> <c:out value = "${row.airline_name}"/></td>
               <td> <c:out value = "${row.price}"/></td>
               <td> <c:out value = "${row.flight_no}"/></td>
               <td> <c:out value = "${row.from_city}"/></td>
               <td> <c:out value = "${row.dest_city}"/></td>
               <td> <c:out value = "${row.depart_time}"/></td>
               <td> <c:out value = "${row.arrival_time}"/></td>
               <td> <c:out value = "${row.total_seats}"/></td>
               <td> <c:out value = "${row.booked_seats}"/></td>
               <td> <c:out value = "${row.avail_seats}"/></td>
               <td> <c:out value = "${row.travel_date}"/></td>
               <td> <c:out value = "${row.bclass}"/></td>
			</tr>
		</c:forEach>
		</table>
</body>
</html>