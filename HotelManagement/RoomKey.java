import java.util.HashMap;

public class RoomKey {
    private String keyId;
    private String barCode;
    private boolean active;
    private boolean isMaster;
    private HashMap<Room, String> map;

    public RoomKey(String keyId, String barCode, boolean active, boolean isMaster){
        this.keyId = keyId;
        this.barCode = barCode;
        this.active = active;
        this.isMaster = isMaster;
        this.map = new HashMap<Room, String>();
    }

    public boolean assignRoom(Room room){
        if(!map.containsKey(room)){
            map.put(room, keyId);
            return true;
        }
        return false;
    }
    public String getKeyId(){
        return keyId;
    }
    public String getBarCode(){
        return barCode;
    }
    public boolean isActive(){
        return active;
    }
    public boolean isMaster(){
        return isMaster;
    }

}
