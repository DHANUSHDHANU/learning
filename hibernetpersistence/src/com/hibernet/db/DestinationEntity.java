package com.hibernet.db;

/**
 * Created by User on 5/1/2017.
 */
public class DestinationEntity {
    private int id;
    private String shipto;

    @Override
    public String toString() {
        return "DestinationEntity{" +
                "id=" + id +
                ", shipto='" + shipto + '\'' +
                ", streetaddress='" + streetaddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", deliverystart='" + deliverystart + '\'' +
                ", deliveryend='" + deliveryend + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }

    private String streetaddress;
    private String city;
    private String state;
    private String country;
    private String deliverystart;
    private String deliveryend;
    private String supplier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShipto() {
        return shipto;
    }

    public void setShipto(String shipto) {
        this.shipto = shipto;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
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

    public String getDeliverystart() {
        return deliverystart;
    }

    public void setDeliverystart(String deliverystart) {
        this.deliverystart = deliverystart;
    }

    public String getDeliveryend() {
        return deliveryend;
    }

    public void setDeliveryend(String deliveryend) {
        this.deliveryend = deliveryend;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DestinationEntity that = (DestinationEntity) o;

        if (id != that.id) return false;
        if (shipto != null ? !shipto.equals(that.shipto) : that.shipto != null) return false;
        if (streetaddress != null ? !streetaddress.equals(that.streetaddress) : that.streetaddress != null)
            return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (deliverystart != null ? !deliverystart.equals(that.deliverystart) : that.deliverystart != null)
            return false;
        if (deliveryend != null ? !deliveryend.equals(that.deliveryend) : that.deliveryend != null) return false;
        if (supplier != null ? !supplier.equals(that.supplier) : that.supplier != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (shipto != null ? shipto.hashCode() : 0);
        result = 31 * result + (streetaddress != null ? streetaddress.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (deliverystart != null ? deliverystart.hashCode() : 0);
        result = 31 * result + (deliveryend != null ? deliveryend.hashCode() : 0);
        result = 31 * result + (supplier != null ? supplier.hashCode() : 0);
        return result;
    }
}
