<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
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
		select * from booking_details;
	</sql:query>
	
	<table border = "1" width="100%">
         <tr>
            <th>Booking Id</th>
            <th>Username (Email)</th>
            <th>Flight number</th>
         </tr>
         
         <c:forEach var = "row" items = "${rs.rows}">
            <tr>
               <td> <c:out value = "${row.booking_id}"/></td>
               <td> <c:out value = "${row.username}"/></td>
               <td> <c:out value = "${row.flight_no}"/></td>
			</tr>
		</c:forEach>
		</table>
</body>
</html>