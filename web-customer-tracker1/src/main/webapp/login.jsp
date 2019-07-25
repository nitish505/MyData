<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">
<div class="row">
<div class="col-md-4"></div>
<div class="col-md-4">
  <h2>Details form</h2>
  <form class="form-horizontal" action="customer/LoginServlet" autocomplete="off" >
    <div class="form-group">
	<label class="control-label col-md-3 "for="email">Email:<br></label>
	 <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user">
	 </i></span>
      
      <input type="text" class="form-control col-md-3" id="username"  placeholder="Enter username" name="uname" >
    </div>
	</div>
    <div class="form-group">
	<label class="control-label col-md-3" for="pwd">Password:<br></label>
	<div class="input-group">
      <span class="input-group-addon"><i class="glyphicon glyphicon-lock">
	  </i></span>
      
      <input type="password" class="form-control col-md-3" id="pwd" placeholder="Enter password" name="pass">
    </div>
	</div>
	<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4"><button type="submit" class="btn btn-default">Submit</button></div>
	<div class="col-md-4"></div>
	</div>
	</form>
	</div>
	<div class="col-md-4"></div>
	
	</div>
	</div>
</body>
</html>