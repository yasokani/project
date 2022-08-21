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
		String username = (String)session.getAttribute("mail");
 		pageContext.setAttribute("username", username);
 		String password = (String)session.getAttribute("password");
 		pageContext.setAttribute("password", password);
 		
 		String noPersons = (String)session.getAttribute("noOfPersons");
 		int noOfPersons = Integer.parseInt(noPersons);
 		pageContext.setAttribute("noOfPersons", noOfPersons);
 		
 		int flight_no = Integer.parseInt(request.getParameter("fno"));
 		pageContext.setAttribute("flight_no", flight_no);
 		//out.println(noOfPersons);
 		//out.println(flight_no);
 		
 		session.setAttribute("fno", flight_no);
	%>
	
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>  
	
	<sql:update var="rs" dataSource = "${db}">
		insert into booking_details (username,flight_no) values (?,?);
		<sql:param value="${username}"></sql:param>
		<sql:param value="${flight_no}"></sql:param>
	</sql:update>

	<sql:update var="rs" dataSource = "${db}">
		update flight_details set avail_seats = avail_seats-? where flight_no = ?;
		<sql:param value="${noOfPersons}"></sql:param>
		<sql:param value="${flight_no}"></sql:param>
	</sql:update>

	<h2 align="center">Fill the personal details</h2>	
	<form action="reviewPage.jsp" method="post">
		<table width="60%" align="center">
			<tr>
				<td> Enter name </td>
				<td> <input type="text" name="name"> </td>
			</tr>
			<tr>
				<td> Enter Address </td>
				<td> <input type="text" name="address"> </td>
			</tr>
			<tr>
				<td> Enter Age </td>
				<td> <input type="text" name="age"> </td>
			</tr>			
			<tr>
				<td> Enter mobile </td>
				<td> <input type="text" name="mobile"> </td>
			</tr>
			<tr>
				<td> Enter email </td>
				<td> <input type="text" name="mail"> </td>
			</tr>	
			<tr>
				<td> Select Country </td>
				<td>  
					<select name="country">
						<option value="India">India</option>
						<option value="USA">USA</option>
						<option value="UK">UK</option>
						<option value="Singapore">Singapore</option>
						<option value="Malysia">Malysia</option>
						<option value="Pakistan">Pakistan</option>
						<option value="Russia">Russia</option>
					</select>
				</td>
			</tr>		
			<tr>
				<td>  
					<select name="identity">
						<option value="Adhaar">Adhaar card</option>
						<option value="Voterid">Voter id</option>
						<option value="Driving">Driving License</option>
						<option value="Passport">Passport</option>
						<option value="SSN">SSN</option>
					</select>
				</td>
				<td> <input type="text" name="identityno"> </td>
			</tr>		
		</table>
		<br><h3 align="center">click here to <input type="submit" value="Review"></h3>
	</form>
</body>
</html>