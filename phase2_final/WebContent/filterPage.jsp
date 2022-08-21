<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.io.*,java.time.*,java.text.SimpleDateFormat"%>
    <%@ page import="java.util.Date,java.io.*,java.util.Enumeration"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>  
     
     <%
     	String username = (String)session.getAttribute("mail");
     	pageContext.setAttribute("username", username);
     	String password = (String)session.getAttribute("password");
     	pageContext.setAttribute("password", password);
     	String date = request.getParameter("dot");
        pageContext.setAttribute("date", date);
     	String source_city = request.getParameter("source");
        pageContext.setAttribute("source_city", source_city);
     	String dest_city = request.getParameter("dest");
        pageContext.setAttribute("dest_city", dest_city);
     	String noOfPersons = request.getParameter("nop");
        pageContext.setAttribute("noOfPersons", noOfPersons);
     	//     	SimpleDateFormat dot = new SimpleDateFormat("yyyy-MM-DD");
  		//   	Date date2 = (Date)dot.parse(date);
     	out.println(date + " " + source_city + " " + dest_city + " " + noOfPersons);
     %>
     
     <h3>Available flight schedules from <%= source_city%> to <%=dest_city %></h3>
     <h3>Date : <%=date %></h3>
     <h3>Total persons : <%=noOfPersons %></h3>
     
     <sql:query var="rs" dataSource = "${db}">
     	select * from flight_details where from_city=? and dest_city=? and travel_date=?;
     		<sql:param value="${source_city}"></sql:param>
     		<sql:param value="${dest_city}"></sql:param>
     		<sql:param value="${date}"></sql:param>
     </sql:query>
     	<%--  -->

    
	 <%-- where travel_date=(?) and from_city=(?) and dest_city=(?)
	 <sql:dateParam value="${date2}" type="DATE"/>
     	<sql:param value="${source_city}"></sql:param>
     	<sql:param value="${dest_city}"></sql:param>
	 <sql:dateParam value = "<%=DoB%>" type = "DATE" /> --%>
	 
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
               <%-- <c:set var="fno" value="${row.flight_no}" scope="page" /> --%>
               <td> <c:out value = "${row.from_city}"/></td>
               <td> <c:out value = "${row.dest_city}"/></td>
               <td> <c:out value = "${row.depart_time}"/></td>
               <td> <c:out value = "${row.arrival_time}"/></td>
               <td> <c:out value = "${row.total_seats}"/></td>
               <td> <c:out value = "${row.booked_seats}"/></td>
               <td> <c:out value = "${row.avail_seats}"/></td>
               <td> <c:out value = "${row.travel_date}"/></td>
               <td> <c:out value = "${row.bclass}"/></td>
			<td><form action="register.jsp" method="post">
               <%
               		//out.println()
					session.setAttribute("noOfPersons", noOfPersons);
               		//session.setAttribute("fno","${row.flight_no}");
				%>
				<input type="hidden" name="fno" value="${row.flight_no}">				
				<input type="submit" value="Register">
			</form></td>
            </tr>
         </c:forEach>
      </table>
</body>
</html>