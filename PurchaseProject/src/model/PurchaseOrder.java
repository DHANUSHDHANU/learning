package model;

public class PurchaseOrder {
	private int poNumber ;
	private String priority;
	private String status;
	
	private String issueDate;
	private String dueDate;
	private String billTo;
	private String transResp;
	private String incoTerms;
	private String designatedMode;
	private String carrier;
	private String seller;
	private Origin originAddress;
	private Desti designationAddress;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	
	
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	
	public int getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(int poNumber) {
		this.poNumber = poNumber;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getBillTo() {
		return billTo;
	}
	public void setBillTo(String billTo) {
		this.billTo = billTo;
	}
	public String getTransResp() {
		return transResp;
	}
	public void setTransResp(String transResp) {
		this.transResp = transResp;
	}
	public String getIncoTerms() {
		return incoTerms;
	}
	public void setIncoTerms(String incoTerms) {
		this.incoTerms = incoTerms;
	}
	public String getDesignatedMode() {
		return designatedMode;
	}
	public void setDesignatedMode(String designatedMode) {
		this.designatedMode = designatedMode;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public Origin getOriginAddress() {
		return originAddress;
	}
	public void setOriginAddress(Origin originAddress) {
		this.originAddress = originAddress;
	}
	public Desti getDesignationAddress() {
		return designationAddress;
	}
	public void setDesignationAddress(Desti designationAddress) {
		this.designationAddress = designationAddress;
	}
	
	
	
}
