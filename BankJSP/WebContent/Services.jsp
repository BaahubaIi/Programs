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
	int count=0;
String uname=request.getParameter("uname");
String password=request.getParameter("pwd");
out.print(uname);
out.print(password);
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from login;");
while(rs.next()) {
	String t1=rs.getString(1);
	String t2=rs.getString(2);
	if(uname.equals(t1)&& password.equals(t2)) {
		count=1;
		break;
	}
}
if(count==1) {
	out.println("Authorized User");
}
else
	out.println("Not an authorized user");
}
catch(Exception e)
{
	out.print(e);
}
%>
</body>
</html>