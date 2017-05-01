package action;

import database.ConnectionManage;
import model.Desti;
import model.Origin;
import model.PurchaseOrder;
import org.apache.struts.action.Action;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 4/29/2017.
 */
public class RegisterDao {
    Connection con = null;
    PreparedStatement pst = null;

    public int save(PurchaseOrder r) {
        int insert = 0;
        System.out.println("    above try");
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/cimbidia", "root", "root");
            System.out.println("    insid try");
            pst = con.prepareStatement(
                    "INSERT INTO origin (id, shipfrom, streetadress, city, state, country, pickupstart, pickupend, items) VALUES (null, ?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            Origin origin = r.getOriginAddress();
            pst.setString(1, origin.getShipFrom());
            pst.setString(2, origin.getStreatAddress());
            pst.setString(3, origin.getCity());
            pst.setString(4, origin.getState());
            pst.setString(5, origin.getCountry());
            pst.setString(6, origin.getPickUpStart());
            pst.setString(7, origin.getPickUpEnd());
            pst.setString(8, origin.getItems());
            System.out.print("above ececute");
            pst.executeUpdate();
            ResultSet rs = pst.getGeneratedKeys();
            rs.next();
            int originAddId = rs.getInt(1);
            System.out.println("    inserted succesfully");

            pst = con.prepareStatement(
                    "INSERT INTO destination (id,shipto,streetaddress,city,state,country,deliverystart,deliveryend,supplier) VALUES (null, ?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            Desti desti = r.getDesignationAddress();
            pst.setString(1, desti.getShipTo());
            pst.setString(2, desti.getStreatAddress());
            pst.setString(3, desti.getCity());
            pst.setString(4, desti.getState());
            pst.setString(5, desti.getCountry());
            pst.setString(6, desti.getDeliveryStart());
            pst.setString(7, desti.getDeliveryEnd());
            pst.setString(8, desti.getSupplier());

            pst.executeUpdate();
            rs = pst.getGeneratedKeys();
            rs.next();
            int destinationAddId = rs.getInt(1);
            System.out.println("    inserted succesfully");

            pst = con.prepareStatement(
                    "INSERT INTO purchase_order(id,po_number,status,priority,issue_date,due_date,seller,bill_to,trans_resp,inco_terms,designated_mode,carrier,origin_address_id,destination_address_id)"
                            + " VALUES (null, ?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setInt(1, r.getPoNumber());
            pst.setString(2, r.getStatus());
            pst.setString(3, r.getPriority());
            pst.setString(4, r.getIssueDate());
            pst.setString(5, r.getDueDate());
            pst.setString(6, r.getSeller());
            pst.setString(7, r.getBillTo());
            pst.setString(8, r.getTransResp());
            pst.setString(9, r.getIncoTerms());
            pst.setString(10, r.getDesignatedMode());
            pst.setString(11, r.getCarrier());
            pst.setInt(12, originAddId);
            pst.setInt(13, destinationAddId);

            insert = pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("    catch succesf");
        }
        return 0;
    }


    public List<PurchaseOrder> retrivePurchase() {
        List<PurchaseOrder> orderList = new ArrayList<>();
        try {
            System.out.println("inside try");
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/cimbidia", "root", "root");

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
      //  request.setPara
        return orderList;

    }

}