import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList <HotelLocation> locations;

    public Hotel(String name) {
        this.name = name;
        locations = new ArrayList<HotelLocation>();
    }

    public String getName() {
        return name;
    }

    public boolean addLocation(HotelLocation location) {
        return this.locations.add(location);
    }

    public ArrayList<HotelLocation> getLocations(){
        return locations;
    }
}
