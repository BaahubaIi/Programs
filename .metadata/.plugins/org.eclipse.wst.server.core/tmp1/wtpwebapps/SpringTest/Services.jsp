<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="java.sql.*" import="java.util.*" import="java.servlet.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
try{
String name=request.getParameter("name");
int age=Integer.parseInt(request.getParameter("age"));
out.print("Hello "+name);
out.print(" of age : "+age);
if(age>62)
	out.print("Ticket Price is 7$");
else if(age<10)
	out.print("Ticket Price is 5$");
else
	out.print("Ticket Price is 9.5$");
}
catch(Exception e)
{
	out.print(e);
}
%>
</body>
</html>