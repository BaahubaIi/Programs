<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset = "UTF-8" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
div.relative {
  position: relative;
  width: 850px;
  height: 200px;
} 
div.absolute {
  position: absolute;
  top: 80px;
  right: 100px;
  width: 200px;
  height: 100px;
}
</style>
</head>
<body>
<div class="relative">
<jsp:include page="home.html"></jsp:include>
</div>
<div class="absolute">
<form action="LoginServlet">
<table>
<tr><th>Username : </th><td><input type="text" name="uname" required/></td></tr><br>
<tr><th>Password : </th><td><input type="password" name="pwd" required/></td></tr><br>
<tr><th><input type="submit" value="Login"></th></tr>
</form>
</table>
</div>
</body>
</html>