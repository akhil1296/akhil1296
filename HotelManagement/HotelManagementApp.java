public class HotelManagementApp{
    public static void main(String args[]){
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("        Welcome to the Hotel Management App         ");
        System.out.println("----------------------------------------------------");

        // Setting up the hotel details
        // 1. Setting the hotel address
            
        Address location1 = new Address("Pared Chaurah", "Kanpur", "Uttar Pradesh", "India", "208021");
        Address location2 = new Address("Lal Imli", "Kanpur", "Uttar Pradesh", "India", "208022");
        Address location3 = new Address("Barra", "Kanpur", "Uttar Pradesh", "India", "208023");
        Address location4 = new Address("Saket Nagar", "Kanpur", "Uttar Pradesh", "India", "208024");
        Address location5 = new Address("Govind Nagara", "Kanpur", "Uttar Pradesh", "India", "208025");
        
        // 2. Setting up the hotel locations
        HotelLocation h1 = new HotelLocation(location1);
        HotelLocation h2 = new HotelLocation(location2);
        HotelLocation h3 = new HotelLocation(location3);
        HotelLocation h4 = new HotelLocation(location4);
        HotelLocation h5 = new HotelLocation(location5);
        
        // 3. Adding the locations to the hotel
        Hotel hotel = new Hotel("Hotel Landmark");
        boolean isSuccessfullyaAdded = hotel.addLocation(h1);
        isSuccessfullyaAdded = hotel.addLocation(h2);
        isSuccessfullyaAdded = hotel.addLocation(h3);
        isSuccessfullyaAdded = hotel.addLocation(h4);
        isSuccessfullyaAdded = hotel.addLocation(h5);

        System.out.println("Location added successfully : " + isSuccessfullyaAdded);

        System.out.println("----------------------------------------------------");
        System.out.println("       Showing the list of hotels         ");
        System.out.println("----------------------------------------------------");

        for(HotelLocation T : hotel.getLocations()){
            System.out.println(T.getName());
        }

        System.out.println("----------------------------------------------------");

        // Adding the actors account types 
        Account manager = new Account("Hamid Miyan", "Manager@123", AccounStatus.ACTIVE);
        Account receptionist = new Account("Sayli Kamli", "Reception@123", AccounStatus.ACTIVE);
        Account staff = new Account("RamLal", "Staff@123", AccounStatus.ACTIVE);
        Account guest = new Account("Guest", "Guest@123", AccounStatus.ACTIVE);
        
        // Setting up the Actors addresses 
        Address guestAddress = new Address("EC", "Bangalore", "Karnataka", "India", "510100");
        Address managerAddress = new Address("EC", "Bangalore", "Karnataka", "India", "510100");
        Address receptionistAddress = new Address("EC", "Bangalore", "Karnataka", "India", "510100");
        Address staffAddress = new Address("EC", "Bangalore", "Karnataka", "India", "510100");

        // Setting up the Actors personality 
        Person guest1 = new Guest("Akhilesh Gautam", "akhilesh.gautam@wipro.com", "8765040831", guestAddress, guest);
        Person manager1 = new Manager("Gaurav Devdutt", "gaurav.devdutt@wipro.com", "981240831", managerAddress, manager);
        Person receptionist1 = new Receptionist("Sheena Singh", "sheena.singh@wipro.com", "981443831", receptionistAddress, receptionist);
        Person staff1 = new Staff("Kamlesh Singh", "kamlesh.singh@wipro.com", "981443131", staffAddress, staff);
        
        System.out.println(staff1.getName());
        System.out.println(manager1.getName());
        System.out.println(guest1.getName());
        System.out.println(receptionist1.getName());

        System.out.println("----------------------------------------------------");

        // Setting up the rooms
        Room room1 = new Room("101", RoomStyle.DELUXE, RoomStatus.AVAILABLE, 4000);
        Room room2 = new Room("102", RoomStyle.STANDARD, RoomStatus.AVAILABLE, 3000);
        Room room3 = new Room("103", RoomStyle.SUITE, RoomStatus.AVAILABLE, 8000);
        Room room4 = new Room("104", RoomStyle.STANDARD, RoomStatus.AVAILABLE, 3000);
        Room room5 = new Room("105", RoomStyle.DELUXE, RoomStatus.AVAILABLE, 4000);

        room1.setRoomList(room1);
        room2.setRoomList(room2);
        room3.setRoomList(room3);
        room4.setRoomList(room4);
        room5.setRoomList(room5);
        
        RoomKey key1 = new RoomKey("111", "1a1a1a", true, false);
        RoomKey key2 = new RoomKey("222", "2a2a2a", true, false);
        RoomKey key3 = new RoomKey("333", "3a3a3a", true, false);
        RoomKey key4 = new RoomKey("444", "4a4a4a", true, false);
        RoomKey key5 = new RoomKey("555", "5a5a5a", true, false);

        key1.assignRoom(room1);
        key2.assignRoom(room2);
        key3.assignRoom(room3);
        key4.assignRoom(room4);
        key5.assignRoom(room5);
        
        
        System.out.println(room1.isRoomAvailable());

    }
}