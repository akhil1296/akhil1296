import java.util.ArrayList;

public class Room implements Search{
    private String roomNumber;
    private RoomStyle style;
    private RoomStatus status;
    private double bookingPrice;
    private ArrayList<RoomKey> roomKeyList;
    private ArrayList<HouseKeepingLog> houseKeepingLog;
    private ArrayList<Room> roomList;

    public Room(String roomNumber, RoomStyle style, RoomStatus status, double bookingPrice){
        this.roomNumber = roomNumber;
        this.style = style;
        this.status = status;
        this.bookingPrice = bookingPrice; 
        this.houseKeepingLog = new ArrayList<HouseKeepingLog>(); 
    }

    public void setRoomList(Room room){
        roomList = new ArrayList<Room>();
        roomList.add(room);
    }
    public ArrayList<Room> search(Room roomStyle, int duration){
        return roomList;
    }
    public String getRoomNumber(){
        return roomNumber;
    }
    public RoomStyle getRoomStyle(){
        return style;
    }
    public RoomStatus getRoomStatus(){
        return status;
    }
    public double getBookingPrice(){
        return bookingPrice;
    }
    public void setRoomKeyList(RoomKey roomKey){
        roomKeyList = new ArrayList<RoomKey>();
        roomKeyList.add(roomKey);
    }
    public ArrayList<RoomKey> getRoomKeyList(){
        return roomKeyList;
    }
    public ArrayList<HouseKeepingLog> getHouseKeepingLogs(){
        return houseKeepingLog;
    }
    public boolean isRoomAvailable(){
        if(status.equals(RoomStatus.AVAILABLE)){
            return true;
        } 
        return false;
    }
    public boolean checkIn(){
        return true;
    }
    public boolean checkOut(){
        return true;
    }
}
