<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" 
    import="java.sql.*"  import="javax.servlet.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
try{
	int id=Integer.parseInt(request.getParameter("emp_id"));
	String name=request.getParameter("emp_name");
	String dept=request.getParameter("emp_dept");
	String desg=request.getParameter("emp_desg");
	String company=request.getParameter("emp_company");
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.
	getConnection("jdbc:mysql://localhost:3306/tiger","root","root");
	 PreparedStatement pst=connection.prepareStatement("update employee set name=?,dept=?,desg=?,company=? where id=?;");
pst.setString(1,name);
pst.setString(2,dept);
pst.setString(3,desg);
pst.setString(4,company);
pst.setInt(5,id);
int i=pst.executeUpdate();
	if(i!=0)
	{
		out.print("updated succesfully");
	}
	else{
		out.print("Failed");
}
	
			
 }
catch(Exception e) {out.print(e);}
%>
</body>
</html>