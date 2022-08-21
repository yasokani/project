<%@page import="com.admin.Logindetails, org.hibernate.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
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
		String email = request.getParameter("email");
		String oldPass = request.getParameter("oldpass");
		String newPass = request.getParameter("newpass");
		String confirmPass = request.getParameter("confirmpass");
		Logindetails login = new Logindetails();
		int flag = login.verifyPassword(email,oldPass,newPass,confirmPass);
		if(flag==-2){
			out.print("<h3 style='color:red'>Please re-confirm your new password!!</h3>");
		}
		else if(flag==-1){
			out.print("<h3 style='color:red'>your old password does not match !!</h3>");
		}
		else if(flag==-3){
			out.print("<h3 style='color:red'>Old password and new password are same, cannot update!! </h3>");
		}
		
		int flag2=0;
		if(flag==1){
			flag2 = login.changePassword(email, oldPass, newPass);
		}
		
		if(flag2==1){
			out.print("<h3 style='color:blue'>your password has been chnaged successfully !!</h3>");
		}
		else{
			out.print("<h3 style='color:red'>Try again !!</h3>");
		}
	%>
	
</body>
</html>