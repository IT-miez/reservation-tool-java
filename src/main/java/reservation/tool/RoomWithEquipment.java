package reservation.tool;

public class RoomWithEquipment implements Room {
    private String roomName;
    private int roomNumber;
    private int roomSize;
    private int chairs;
    private int screens;
    private int tables;
    private int LANConnections;


    public RoomWithEquipment(int roomNumber, int chairs, int screens, int tables, int LANConnections) {
        this.roomNumber = roomNumber;
        this.chairs = chairs;
        this.screens = screens;
        this.tables = tables;
        this.LANConnections = LANConnections;
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

    public int getChairs() {
        return this.chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public int getTables() {
        return this.tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }

    public int getScreens() {
        return this.screens;
    }

    public void setScreens(int screens) {
        this.screens = screens;
    }

    public int getLANConnections() {
        return this.LANConnections;
    }

    public void setLANConnections(int LANConnections) {
        this.LANConnections = LANConnections;
    }

}
