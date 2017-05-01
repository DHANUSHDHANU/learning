<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN here</title>
<link rel="stylesheet" type="text/css"
	href="bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="bootstrap/css/bootstrap.css" />

<link rel="stylesheet" type="text/css" href="loginStyle.css" />
	<script>
	function something(){
	    alert(document.forms[0].action);
	}
	</script>
</head>
<body>
	<form action="/login.do" method="post" class="formcolor" >
		<h4 class="textcolor" align="center">LOGIN TO YOUR CIMBIDIA
			ACCOUNT</h4>
		<div class="row">
			<div class="col-md-offset-2 col-md-8">
				<input type="text" class="form-control"
					style="background-color: lavender;" name="username" id="username"
					placeholder="enter username">
			</div>
			<br>
			<div class="col-md-offset-2 col-md-8">
				<input type="text" class="form-control"
					style="background-color: lavender;" name="password" id="password"
					placeholder="enter password";>
			</div>
			<br>
			<br>
			<div class="col-md-offset-2 col-md-5">
				<p class="textcolor">
					Forgot your username or password? <a href=#> Click to reset</a>
				</p>
			</div>
			<div class="col-md-offset-1 col-md-3">
				<input class="textcolor" type="submit" value="LOGIN"
					style="border-radius: 5em; background-color: blue;" onclick="something();">
			</div>
		</div>

		<br>
		<div class="col-md-8"></div>
	</form>
</body>
</html>