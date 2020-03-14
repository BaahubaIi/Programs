<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="java.sql.*"
    import="javax.servlet.*"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
try{
	int id=Integer.parseInt(request.getParameter("id"));
	Class.forName("com.mysql.jdbc.Driver");  
	//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tiger","root","root");
    PreparedStatement pst=connection.prepareStatement("select * from employee where id=?;");
    pst.setInt(1,id);
    ResultSet rs=pst.executeQuery();

    if(rs.next())
{
	%><form action="Disp.jsp">
	Name : <input type="text" name="emp_name" value="<%= rs.getString(1)%>"><br>
	Dept : <input type="text" name="emp_dept" value="<%= rs.getString(3)%>"><br>
	Desg : <input type="text" name="emp_desg" value="<%= rs.getString(4)%>"><br>
	Company : <input type="text" name="emp_comp" value="<%= rs.getString(5)%>"><br>
	<input type="submit" value="update">
	</form>
<%} 
else {out.println("Invalid user ID");}
pst.close();
connection.close();}
catch(Exception e){out.print(e);}
%>
</body>
</html>