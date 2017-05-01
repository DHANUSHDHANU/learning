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
</head>
<body>
	<form class="formcolor" method="post" action="LoginValidate">
		<h4 class="textcolor" align="center">LOGIN TO YOUR CIMBIDIA
			ACCOUNT</h4>
		<div class="row">
			<div class="col-md-offset-2 col-md-8">
				<input type="text" class="form-control"
					style="background-color: lavender;" name="username" id="user"
					placeholder="enter username">
			</div>
			<br>
			<div class="col-md-offset-2 col-md-8">
				<input type="text" class="form-control"
					style="background-color: lavender;" name="password" id="pass"
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
					style="border-radius: 5em; background-color: blue;">
			</div>
		</div>

		<br>
		<div class="col-md-8"></div>
	</form>
</body>
</html>