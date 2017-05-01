package action;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by User on 4/29/2017.
 */
public class RegisterActionForm extends ActionForm {



    private int  ponumber;
    private String poisuuedate;
    private String transresp;
    private String designationmode;
    private String status;
    private String duedate;
    private String incoterms;
    private String carrier;
    private String priority;
    private String  seller;
    private String billto;
    private String shipfrom;
    private String shipto;
    private String originstreet;
    private String destinationstreet;
    private String origincity;
    private String destinationcity;
    private String originstate;
    private String destinationstate;
    private String origincountry;
    private String destinationcountry;
    private String pickupstart;
    private String deliverystart;
    private String pickupend;
    private String deliveryend;
    private String Items;
    private String supplier;


    public int getPonumber() {
        return ponumber;
    }

    public void setPonumber(int ponumber) {
        this.ponumber = ponumber;
    }

    public String getPoisuuedate() {
        return poisuuedate;
    }

    public void setPoisuuedate(String poisuuedate) {
        this.poisuuedate = poisuuedate;
    }

    public String getTransresp() {
        return transresp;
    }

    public void setTransresp(String transresp) {
        this.transresp = transresp;
    }

    public String getDesignationmode() {
        return designationmode;
    }

    public void setDesignationmode(String designationmode) {
        this.designationmode = designationmode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getIncoterms() {
        return incoterms;
    }

    public void setIncoterms(String incoterms) {
        this.incoterms = incoterms;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBillto() {
        return billto;
    }

    public void setBillto(String billto) {
        this.billto = billto;
    }

    public String getShipfrom() {
        return shipfrom;
    }

    public void setShipfrom(String shipfrom) {
        this.shipfrom = shipfrom;
    }

    public String getShipto() {
        return shipto;
    }

    public void setShipto(String shipto) {
        this.shipto = shipto;
    }

    public String getOriginstreet() {
        return originstreet;
    }

    public void setOriginstreet(String originstreet) {
        this.originstreet = originstreet;
    }

    public String getDestinationstreet() {
        return destinationstreet;
    }

    public void setDestinationstreet(String destinationstreet) {
        this.destinationstreet = destinationstreet;
    }

    public String getOrigincity() {
        return origincity;
    }

    public void setOrigincity(String origincity) {
        this.origincity = origincity;
    }

    public String getDestinationcity() {
        return destinationcity;
    }

    public void setDestinationcity(String destinationcity) {
        this.destinationcity = destinationcity;
    }

    public String getOriginstate() {
        return originstate;
    }

    public void setOriginstate(String originstate) {
        this.originstate = originstate;
    }

    public String getDestinationstate() {
        return destinationstate;
    }

    public void setDestinationstate(String destinationstate) {
        this.destinationstate = destinationstate;
    }

    public String getOrigincountry() {
        return origincountry;
    }

    public void setOrigincountry(String origincountry) {
        this.origincountry = origincountry;
    }

    public String getDestinationcountry() {
        return destinationcountry;
    }

    public void setDestinationcountry(String destinationcountry) {
        this.destinationcountry = destinationcountry;
    }

    public String getPickupstart() {
        return pickupstart;
    }

    public void setPickupstart(String pickupstart) {
        this.pickupstart = pickupstart;
    }

    public String getDeliverystart() {
        return deliverystart;
    }

    public void setDeliverystart(String deliverystart) {
        this.deliverystart = deliverystart;
    }

    public String getPickupend() {
        return pickupend;
    }

    public void setPickupend(String pickupend) {
        this.pickupend = pickupend;
    }

    public String getDeliveryend() {
        return deliveryend;
    }

    public void setDeliveryend(String deliveryend) {
        this.deliveryend = deliveryend;
    }

    public String getItems() {
        return Items;
    }

    public void setItems(String items) {
        Items = items;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "RegisterAction{" +
                "ponumber=" + ponumber +
                ", poisuuedate='" + poisuuedate + '\'' +
                ", transresp='" + transresp + '\'' +
                ", designationmode='" + designationmode + '\'' +
                ", status='" + status + '\'' +
                ", duedate='" + duedate + '\'' +
                ", incoterms='" + incoterms + '\'' +
                ", carrier='" + carrier + '\'' +
                ", priority='" + priority + '\'' +
                ", seller='" + seller + '\'' +
                ", billto='" + billto + '\'' +
                ", shipfrom='" + shipfrom + '\'' +
                ", shipto='" + shipto + '\'' +
                ", originstreet='" + originstreet + '\'' +
                ", destinationstreet='" + destinationstreet + '\'' +
                ", origincity='" + origincity + '\'' +
                ", destinationcity='" + destinationcity + '\'' +
                ", originstate='" + originstate + '\'' +
                ", destinationstate='" + destinationstate + '\'' +
                ", origincountry='" + origincountry + '\'' +
                ", destinationcountry='" + destinationcountry + '\'' +
                ", pickupstart='" + pickupstart + '\'' +
                ", deliverystart='" + deliverystart + '\'' +
                ", pickupend='" + pickupend + '\'' +
                ", deliveryend='" + deliveryend + '\'' +
                ", Items='" + Items + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }


}

