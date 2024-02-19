package reservation.tool;

public class RoomWithEquipment implements Room {
    private String roomName;
    private int roomNumber;
    private int roomSize;
    private int chairs;
    private int screens;
    private int tables;
    private int LAN_connections;

    public RoomWithEquipment(int roomNumber, int chairs, int screens, int tables, int LAN_connections) {
        this.chairs = chairs;
        this.screens = screens;
        this.tables = tables;
        this.LAN_connections = LAN_connections;
    }

    public RoomWithEquipment(int roomNumber, int roomSize, String roomName) {
        this.roomNumber = roomNumber;
        this.roomSize = roomSize;
        this.roomName = roomName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomSize() {
        return this.roomSize;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

}
