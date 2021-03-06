public class Address {
    private String streetName;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    public Address(String streetName, String city, String state, String country, String zipCode) {
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
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

    public String getZipCode() {
        return zipCode;
    }
}
