package model;

public class Desti {
	private int id;
	private String shipTo;
	private String streatAddress;
	private String city;
	private String state;
	private String country;
	private String deliveryStart;
	private String deliveryEnd;
	private String supplier;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShipTo() {
		return shipTo;
	}
	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}
	public String getStreatAddress() {
		return streatAddress;
	}
	public void setStreatAddress(String streatAddress) {
		this.streatAddress = streatAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDeliveryStart() {
		return deliveryStart;
	}
	public void setDeliveryStart(String deliveryStart) {
		this.deliveryStart = deliveryStart;
	}
	public String getDeliveryEnd() {
		return deliveryEnd;
	}
	public void setDeliveryEnd(String deliveryEnd) {
		this.deliveryEnd = deliveryEnd;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	public Desti(int id, String shipTo, String streatAddress, String city, String state, String country,
			String deliveryStart, String deliveryEnd, String supplier) {
		super();
		this.id = id;
		this.shipTo = shipTo;
		this.streatAddress = streatAddress;
		this.city = city;
		this.state = state;
		this.country = country;
		this.deliveryStart = deliveryStart;
		this.deliveryEnd = deliveryEnd;
		this.supplier = supplier;
	}
	
	public Desti() {
		
	}
	
}
