<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="model.PurchaseOrder"%>
<%@ page import="action.RegisterActionForm" %>
"
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>userlastpage</title>
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
	<br>
	<div >
			<table class="nav nav-pills nav-justified table-condensed table-striped">
				<tr class="textcolour" style="background-color:#0080ff;">
					<td><input type="checkbox" name="selectall" id="selectall" ></td>
					<td>P.O. Number</td>
					<td>Supplier</td>
					<td>Due Date</td>
					<td>P.O. Status</td>
					<td>Priority</td>
					<td>Items(s)</td>
					<td>Ship From</td>
					<td>Ship To</td>
					<td>Trans. Resp.</td>
	       	</tr>
				
				<% List  po = (List) request.getAttribute("purchase");
				for(int i= 0; i<po.size(); i++) { 
					RegisterActionForm purchaseOrder = (RegisterActionForm)po.get(i);
				%>PurchaseOrder
				<tr>
					<td><input type="checkbox" name="select" id="" ></td>
					<td><%= purchaseOrder.getPonumber() %></td>
					<td><%= purchaseOrder.getSeller() %></td>
					<td><%= purchaseOrder.getDuedate() %></td>
					<td><%= purchaseOrder.getStatus() %></td>
					<td><%= purchaseOrder.getPriority() %></td>
					<td></td>
					<td><%= purchaseOrder.getItems() %></td>
					<td><%= purchaseOrder.getShipfrom() %></td>
					<td><%= purchaseOrder.getShipto() %></td>
					<td><%= purchaseOrder.getTransresp() %></td>
				</tr>
				<%} %>
			</table>
		</div>
	
	</form>
</body>
</html>