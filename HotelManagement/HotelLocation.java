public class HotelLocation {
    private String name;
    private Address location;

    public HotelLocation(Address location) {
        this.location = location;
        this.name = location.getStreetName();
    }

    public String getName() {
        return name;
    }

    public Address getLocation() {
        return location;
    }

}
