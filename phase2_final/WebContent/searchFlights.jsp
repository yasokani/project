<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String email = request.getParameter("mail");
		pageContext.setAttribute("email", email);
		String password = request.getParameter("password");
		pageContext.setAttribute("password", password);
		session.setAttribute("mail", email);
		session.setAttribute("password", password);
	%>

	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>  
     
	<sql:update var="rs" dataSource = "${db}">
		insert into userlogin values (?,?);
		<sql:param value="${email}"></sql:param>
		<sql:param value="${password}"></sql:param>
	</sql:update>
	
	<h2>Enter Flight details</h2>
	<form action="filterPage.jsp" method="post">
		Enter Date of Travel : <input type="date" name="dot"> <br> <br>
		
		<label for="source">Choose Source city:</label>
		<select name="source">
			<option>Select</option>
			<option value="Chennai">Chennai</option>
 	 		<option value="Mumbai">Mumbai</option>
  			<option value="Goa">Goa</option>
  			<option value="Delhi">Delhi</option>
		</select> <br> <br>
		
		<label for="dest">Choose Destination city:</label>
		<select name="dest">
			<option>Select</option>
			<option value="Chennai">Chennai</option>
 	 		<option value="Mumbai">Mumbai</option>
  			<option value="Goa">Goa</option>
  			<option value="Delhi">Delhi</option>
		</select> <br> <br>
		
		Number of persons: <input type="text" name="nop"> <br> <br>
		
		<input type="submit" value="Search">
	</form>
</body>
</html>