<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="customer/LoginServlet" method="post">
Username:-<br><input type="text"  placeholder="enter username of admin" name="uname"/><br>
Password:-<br><input type="password" placeholder="enter your password" name="pass"/><br>
<input type="submit" value="submit"/>

</form>
</body>
</html>