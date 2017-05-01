package model;

public class Origin {
	private int id;
	private String shipFrom;
	private String streatAddress;
	private String city;
	private String state;
	private String country;
	private String pickUpStart;
	private String pickUpEnd;
	private String items;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShipFrom() {
		return shipFrom;
	}
	public void setShipFrom(String shipFrom) {
		this.shipFrom = shipFrom;
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
	public String getPickUpStart() {
		return pickUpStart;
	}
	public void setPickUpStart(String pickUpStart) {
		this.pickUpStart = pickUpStart;
	}
	public String getPickUpEnd() {
		return pickUpEnd;
	}
	public void setPickUpEnd(String pickUpEnd) {
		this.pickUpEnd = pickUpEnd;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	
}
