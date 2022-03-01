public class Address {
    private String streetName;
    private String city;
    private String state;
    private String country;
    private String pincode;

    public Address(String streetName, String city, String state, String country, String pincode) {
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public void setAddress(String streetName, String city, String state, String country, String pincode) {
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;

    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPinCode() {
        return pincode;
    }
}
