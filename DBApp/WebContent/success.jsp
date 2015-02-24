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

String name=(String)request.getAttribute("uname");
String city=(String) request.getAttribute("ucity");
Integer mobile=(Integer)request.getAttribute("mob");
out.println("welcome : "+name);
out.println("city is  : "+city);
out.println("contact @ : "+mobile);
%>
<form action="moviesearch">
<select name="movielanguage">
<option value="select">select</option>
<option value="hindi">hindi</option>
<option value="english">english</option>
<option value="tamil">tamil</option>

</select>
<input type="submit" value="submit">


</form>

</body>
</html>