<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome</title>
<link rel="stylesheet" type="text/css"
	href="bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="bootstrap/css/bootstrap.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="Welcomestyle.css" />
</head>
<body>
	<form action="purchaseorder" method="post">
		<nav class="navbar navbar-custom">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand textcolour" href="#">Cimbidia</a>
			</div>
			<div>
				<div class="row">
					<div>
						<div>
							<input type="text" class="searchpos" id="search"
								style="position: relative;" name="search"
								placeholder="Search...."> <input type="button"
								class="btn searchbtn" name="go" style="position: relative;"
								id="go" value="Go">
						</div>
					</div>

					<div class="col-sm-1 col-md-1"></div>
				</div>
			</div>
		</div>
		</nav>
		<div class="row">
			<div class="row text-center"
				style="margin-top: 0px; background-color: #0080ff;">
				<div class="col-md-2 col-sm-2 col-xs-3">
					<a href="#" class="textcolour">Purchase Order|&nbsp;&nbsp;</a>
				</div>
				<div class="col-md-2 col-sm-2 col-xs-3">
					<a href="#" class="textcolour">Customer Order</a>
				</div>
				<div class="col-md-1 col-sm-1 col-xs-3">
					<a href="#" class="textcolour">ASNs</a>
				</div>
				<div class="col-md-1 col-sm-1 col-xs-3">
					<a href="#" class="textcolour">Shipment</a>
				</div>
				<div class="col-md-1 col-sm-1 col-xs-3">
					<a href="#" class="textcolour">Bookings</a>
				</div>
				<div class="col-md-1 col-sm-1 col-xs-3">
					<a href="#" class="textcolour">Invoice</a>
				</div>
				<div class="col-md-1 col-sm-1 col-xs-3">
					<a href="#" class="textcolour">Visibility</a>
				</div>
				<div class="col-md-1 col-sm-1 col-xs-3">
					<a href="#" class="textcolour">Cimchat</a>
				</div>
				<div class="col-md-1 col-sm-1 col-xs-3">
					<a href="#" class="textcolour">settings</a>
				</div>
			</div>
		</div>
		<div style="background-color: #0080ff; margin-top: 0px;">
			<p class="para">NEW PURCHASE ORDER</p>
		</div>
		<br> <br>
		<div class="row">
			<div class="row comtainer text-center">
				<div class="col-md-4 ">
					<div class="row" style="text-align: left;">
						<div class=" col-md-offset-1 col-md-4 ">
							<label>P.O. Number </label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="ponumber" id="ponumber">
						</div>
						<div class=" col-md-offset-1 col-md-4 ">
							<label>P.O. Issue Date </label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="poisuuedate" id="ponumber">
						</div>
						<div class=" col-md-offset-1 col-md-4 ">
							<label>* Ship From </label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="shipfrom" id="ponumber">
						</div>
						<div class=" col-md-offset-1 col-md-4 ">
							<label>Trans Resp </label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="transresp" id="ponumber">
						</div>
						<div class=" col-md-offset-1 col-md-4 ">
							<label>Designated Mode </label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="designationmode" id="ponumber">
						</div>
					</div>
				</div>
				<div class="col-md-4 ">
					<div class="row" style="text-align: left;">
						<div class=" col-md-offset-1 col-md-4 ">
							<label>Status</label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="status" id="status">
						</div>
						<div class=" col-md-offset-1 col-md-4 ">
							<label> *Due Date</label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="duedate" id="duedate">
						</div>
						<div class=" col-md-offset-1 col-md-4 ">
							<label> *Ship to </label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="shipto" id="shipto">
						</div>
						<div class=" col-md-offset-1 col-md-4 ">
							<label> Incoterms </label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="incoterms" id="incoterms">
						</div>
						<div class=" col-md-offset-1 col-md-4 ">
							<label> Carrier </label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="carrier" id="carrier">
						</div>
					</div>
				</div>
				<div class="col-md-4 ">
					<div class="row" style="text-align: left;">
						<div class=" col-md-offset-1 col-md-4 ">
							<label>Priority</label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="priority" id="priority">
						</div>
						<div class=" col-md-offset-1 col-md-4 ">
							<label> Seller/Vendor</label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="seller" id="seller">
						</div>
						<div class=" col-md-offset-1 col-md-4 ">
							<label> Bill To </label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="text" name="billto" id="billto">
						</div>
						<div class=" col-md-offset-1 col-md-4 ">
							<label> Must Ship Together ? </label>
						</div>
						<div class="col-md-offset-1 col-md-4 ">
							<input type="checkbox" name="shifttogether" id="billto">
						</div>
					</div>
				</div>
			</div>
		</div>
		<hr>
		<div class="row" style="text-align: left;">
			<div class="col-lg-6 col-md-6">
				<div class="row">
					<div class="col-lg-offset-1 col-md-offset-1 ">
						<h4 style="color: blue; margin-left: 50px;">ORIGIN</h4>
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6">
				<div class="row">
					<div class="col-lg-offset-1 col-md-offset-1 ">
						<h4 style="color: blue; margin-left: 50px;">DESTINATION</h4>
					</div>
				</div>
			</div>
		</div>
		<div class="row" style="text-align: left;">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>Ship From</label>
					</div>
					<div class=" col-md-6 ">
						<input type="text" class="form-control" name="shipfrom"
							id="shipfrom">
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>Ship To</label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="shipto" id="shipto">
					</div>
				</div>
			</div>
		</div>
		<div class="row" style="text-align: left;">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>Street Address </label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="originstreet"
							id="originstreet">
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>Street Address </label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="destinationstreet"
							id="destinationstreat">
					</div>
				</div>
			</div>
		</div>
		<div class="row" style="text-align: left;">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>City</label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="origincity"
							id="origincity">
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>city</label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="destinationcity"
							id="destinationcity">
					</div>
				</div>
			</div>
		</div>
		<div class="row" style="text-align: left;">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>State </label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="originstate"
							id="originstate">
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>State</label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="destinationstate"
							id="destinationstate">
					</div>
				</div>
			</div>
		</div>
		<div class="row" style="text-align: left;">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>Country</label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="origincountry"
							id="origincountry">
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>Country </label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="destinationcountry"
							id="destinationcountry">
					</div>
				</div>
			</div>
		</div>
		<div class="row" style="text-align: left;">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>Pickup Start</label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="pickupstart"
							id="pickupstart">
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>Delivery Start</label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="deliverystart"
							id="deliverystart">
					</div>
				</div>
			</div>
		</div>
		<div class="row" style="text-align: left;">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>Pickup End</label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="pickupend"
							id="pickupstart">
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>Delivery End</label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="deliveryend"
							id="deliverystart">
					</div>
				</div>
			</div>
		</div>
		<div class="row" style="text-align: left;">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>items</label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="Items" id="items">
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 col-lg-5 col-md-5 col-sm-5 col-xs-5">
						<label>supplier</label>
					</div>
					<div class="col-md-6 ">
						<input type="text" class="form-control" name="supplier"
							id="deliverystart">
					</div>
				</div>
			</div>
		</div>
		<div class="row" style="text-align: left;">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div
						class="col-lg-offset-5 col-md-offset-5 col-sm-offset-5 col-xs-offset-5">
						<input type="submit" class="btn btn-primary" value="submit"
							name="submit">
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div>
						<button class="btn btn-primary" name="reset" value="reset">Reset</button>
					</div>
				</div>
			</div>
		</div>
		<div></div>
	</form>

</body>
</html>