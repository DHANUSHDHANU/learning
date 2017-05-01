package action;

import model.Desti;
import model.Origin;
import model.PurchaseOrder;
import org.apache.commons.validator.Form;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by User on 4/29/2017.
 */
public class RegisterAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        RegisterActionForm registerActionForm = (RegisterActionForm) form;

        int poNumber = registerActionForm.getPonumber();
        String poIssueDate = registerActionForm.getPoisuuedate();
        String transresp = registerActionForm.getTransresp();
        String designationMode = registerActionForm.getDesignationmode();
        String status = registerActionForm.getStatus();
        String duedate = registerActionForm.getDuedate();
        String incoterms = registerActionForm.getIncoterms();
        String carrier = registerActionForm.getIncoterms();
        String priority = registerActionForm.getPriority();
        String seller = registerActionForm.getSeller();
        String billto = registerActionForm.getBillto();
        String shipfrom = registerActionForm.getShipfrom();
        String shipto = registerActionForm.getShipto();
        String originstreet = registerActionForm.getOriginstreet();
        String destinationstreet = registerActionForm.getDestinationstreet();
        String origincity = registerActionForm.getOrigincity();
        String destinationcity = registerActionForm.getDestinationcity();
        String originstate = registerActionForm.getOriginstate();
        String destinationstate = registerActionForm.getDestinationstate();
        String origincountry = registerActionForm.getOrigincountry();
        String destinationcountry = registerActionForm.getDestinationcountry();
        String pickupstart = registerActionForm.getPickupstart();
        String deliverystart = registerActionForm.getDeliverystart();
        String pickupend = registerActionForm.getPickupend();
        String deliveryend = registerActionForm.getDeliveryend();
        String Items = registerActionForm.getItems();
        String supplier = registerActionForm.getSupplier();

        Desti desti = new Desti();
        desti.setShipTo(shipto);
        desti.setStreatAddress(destinationstreet);
        desti.setCity(destinationcity);
        desti.setState(destinationstate);
        desti.setCountry(destinationcountry);
        desti.setDeliveryEnd(deliveryend);
        desti.setDeliveryStart(deliverystart);
        desti.setSupplier(supplier);

        Origin org= new Origin();
        org.setCity(origincity);
        org.setCountry(origincountry);
        org.setItems(Items);
        org.setPickUpEnd(pickupend);
        org.setPickUpStart(pickupstart);
        org.setShipFrom(shipfrom);
        org.setState(originstate);
        org.setStreatAddress(originstreet);

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setBillTo(billto);
        purchaseOrder.setCarrier(carrier);
        purchaseOrder.setDesignatedMode(designationMode);
        purchaseOrder.setDueDate(duedate);
        purchaseOrder.setIncoTerms(incoterms);
        purchaseOrder.setIssueDate(poIssueDate);
        purchaseOrder.setPriority(priority);
        purchaseOrder.setPoNumber(poNumber);
        purchaseOrder.setTransResp(transresp);
        purchaseOrder.setStatus(status);
        purchaseOrder.setSeller(seller);
        purchaseOrder.setDesignationAddress(desti);
        purchaseOrder.setOriginAddress(org);

        RegisterDao purchase = new RegisterDao();
        System.out.println("    before save method");
        purchase.save(purchaseOrder);
        System.out.println("    after save method");

        return mapping.findForward("passwo");
    }

}