package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PurchaseManage;
import model.Desti;
import model.Origin;
import model.PurchaseOrder;


@WebServlet("/purchaseorder")
public class PurchaseOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside purchase order servlet");
		int poNumber = Integer.parseInt(request.getParameter("ponumber"));
		String poDate = request.getParameter("poisuuedate");
		String transResp = request.getParameter("transresp");
		String designationMode = request.getParameter("designationmode");
		String status = request.getParameter("status");
		String dueDate = request.getParameter("duedate");
		String incoTerms = request.getParameter("incoterms");
		String carrier = request.getParameter("carrier");
		String priority = request.getParameter("priority");
		String seller = request.getParameter("seller");
		String billTo = request.getParameter("billto");
		String shiftTogether = request.getParameter("shifttogether");
		String shipFrom = request.getParameter("shipfrom");
		String shipTo =request.getParameter("shipto");
		String originStreet = request.getParameter("originstreet");
		String streetAddress = request.getParameter("destinationstreet");
		String originCity = request.getParameter("origincity");
		String destinationCity = request.getParameter("destinationcity");
		String destinationState = request.getParameter("destinationstate");
		String originCountry = request.getParameter("origincountry");
		String destinationCountry = request.getParameter("destinationcountry");
		String pickUpStart = request.getParameter("pickupstart");
		String deliveryStart = request.getParameter("deliverystart");
		String pickUpEnd = request.getParameter("pickupend");
		String deliveryEnd = request.getParameter("deliveryend");
		String items = request.getParameter("Items");
		String supplier = request.getParameter("supplier");
		String originState=request.getParameter("originstate");

  
    
	Origin originAddress= new Origin();
	  originAddress.setItems(items);
	  originAddress.setShipFrom(shipFrom);
	  originAddress.setCountry(originCountry);
	  originAddress.setCity(originCity);
	  originAddress.setPickUpEnd(pickUpEnd);
	  originAddress.setPickUpStart(pickUpStart);
	  originAddress.setState(originState);
	  originAddress.setStreatAddress(streetAddress);
	
	  Desti destAddress =new Desti();
	  destAddress.setCity(destinationCity);
	  destAddress.setCountry(destinationCountry);
	  destAddress.setDeliveryEnd(deliveryEnd);
	  destAddress.setDeliveryStart(deliveryStart);
	  destAddress.setShipTo(shipTo);
	  destAddress.setState(destinationState);
	  destAddress.setStreatAddress(streetAddress);
	  destAddress.setSupplier(supplier);
	  
	  
	  PurchaseOrder purchaseOrder = new PurchaseOrder();
	  	
	  	purchaseOrder.setBillTo(billTo);
	    purchaseOrder.setCarrier(carrier);
	    purchaseOrder.setDesignatedMode(designationMode);
	    purchaseOrder.setIncoTerms(incoTerms);
	    purchaseOrder.setIssueDate(poDate);
	    purchaseOrder.setPoNumber(poNumber);
	    purchaseOrder.setPriority(priority);
	    purchaseOrder.setTransResp(transResp);
	    purchaseOrder.setOriginAddress(originAddress);
	    purchaseOrder.setDesignationAddress(destAddress);
	    purchaseOrder.setSeller(seller);
	    purchaseOrder.setStatus(status);
	    purchaseOrder.setDueDate(dueDate);
	    PurchaseManage purchase = new PurchaseManage();
	    purchase.createPurchase(purchaseOrder);
	    
	    RequestDispatcher rd=request.getRequestDispatcher("userlastpage");
		rd.forward(request, response); 

	}

	}

