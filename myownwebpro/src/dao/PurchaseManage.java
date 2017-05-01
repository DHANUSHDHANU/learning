package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import database.ConnectionManage;
import model.Desti;
import model.Origin;
import model.PurchaseOrder;

public class PurchaseManage {

	private PreparedStatement pst;
	private Connection con;

	public void createPurchase(PurchaseOrder purchaseOrder) {
		try {
			con = ConnectionManage.getConnection();
			pst = con.prepareStatement(
					"INSERT INTO origin (id, shipfrom, streetadress, city, state, country, pickupstart, pickupend, items) VALUES (null, ?,?,?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			Origin originAdress = purchaseOrder.getOriginAddress();
			pst.setString(1, originAdress.getShipFrom());
			pst.setString(2, originAdress.getStreatAddress());
			pst.setString(3, originAdress.getCity());
			pst.setString(4, originAdress.getState());
			pst.setString(5, originAdress.getCountry());
			pst.setString(6, originAdress.getPickUpStart());
			pst.setString(7, originAdress.getPickUpEnd());
			pst.setString(8, originAdress.getItems());
			int n = pst.executeUpdate();
			ResultSet rs = pst.getGeneratedKeys();
			rs.next();
			int originAddId = rs.getInt(1);
			System.out.println(n + "    inserted succesfully");

			pst = con.prepareStatement(
					"INSERT INTO destination (id,shipto,streetaddress,city,state,country,deliverystart,deliveryend,supplier) VALUES (null, ?,?,?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			Desti destinationAddress = purchaseOrder.getDesignationAddress();
			pst.setString(1, destinationAddress.getShipTo());
			pst.setString(2, destinationAddress.getStreatAddress());
			pst.setString(3, destinationAddress.getCity());
			pst.setString(4, destinationAddress.getState());
			pst.setString(5, destinationAddress.getCountry());
			pst.setString(6, destinationAddress.getDeliveryStart());
			pst.setString(7, destinationAddress.getDeliveryEnd());
			pst.setString(8, destinationAddress.getSupplier());

			int n1 = pst.executeUpdate();
			rs = pst.getGeneratedKeys();
			rs.next();
			int destinationAddId = rs.getInt(1);
			System.out.println(n1 + "    inserted succesfully");

			pst = con.prepareStatement(
					"INSERT INTO purchase_order(id,po_number,status,priority,issue_date,due_date,seller,bill_to,trans_resp,inco_terms,designated_mode,carrier,origin_address_id,destination_address_id)"
							+ " VALUES (null, ?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, purchaseOrder.getPoNumber());
			pst.setString(2, purchaseOrder.getStatus());
			pst.setString(3, purchaseOrder.getPriority());
			pst.setString(4, purchaseOrder.getIssueDate());
			pst.setString(5, purchaseOrder.getDueDate());
			pst.setString(6, purchaseOrder.getSeller());
			pst.setString(7, purchaseOrder.getBillTo());
			pst.setString(8, purchaseOrder.getTransResp());
			pst.setString(9, purchaseOrder.getIncoTerms());
			pst.setString(10, purchaseOrder.getDesignatedMode());
			pst.setString(11, purchaseOrder.getCarrier());
			pst.setInt(12, originAddId);
			pst.setInt(13, destinationAddId);

			int n2 = pst.executeUpdate();

			System.out.println(n2 + "    inserted succesfully");
		} catch (Exception e) {
			System.out.println("inside catch block " + e.getMessage());
		}

	}

	public List<PurchaseOrder> retrivePurchase() {
		List<PurchaseOrder> orderList = new ArrayList<>();
		try {
			System.out.println("inside try");
			//String sql = ;
			con= ConnectionManage.getConnection();
			pst = con.prepareStatement("SELECT po.po_number,po.seller,po.due_date,po.status,po.priority,o.items,o.shipfrom,d.shipto,po.trans_resp "
					+ "FROM purchase_order po "
					+ "JOIN origin o ON po.origin_address_id  = o.id "
					+ "join destination d on d.id = po.destination_address_id;");
			System.out.println(pst);
			ResultSet rs = pst.executeQuery();
			System.out.println("inside retrv1");
			while (rs.next()) {
				System.out.println("inside retriv whil2");
				PurchaseOrder purchaseOrder = new PurchaseOrder();
				purchaseOrder.setPoNumber(rs.getInt("po_number"));
				purchaseOrder.setSeller(rs.getString("seller"));
				purchaseOrder.setDueDate(rs.getString("due_date"));
				purchaseOrder.setStatus(rs.getString("status"));
				purchaseOrder.setPriority(rs.getString("priority"));
				purchaseOrder.setTransResp(rs.getString("trans_resp"));

				Origin org = new Origin();
				org.setItems(rs.getString("items"));
				org.setShipFrom(rs.getString("shipfrom"));

				Desti desti = new Desti();
				desti.setShipTo(rs.getString("shipto"));

				Desti destination = new Desti();
				destination.setShipTo(rs.getString("shipto"));
				purchaseOrder.setOriginAddress(org);
				purchaseOrder.setDesignationAddress(desti);
				orderList.add(purchaseOrder);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("inside catchretriv");
		}
		return orderList;
		
	}
}
