package reservation.tool;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        RoomWithEquipment testRealRoom = new RoomWithEquipment(3471, 10, 2, 4, 10);

        System.out.println(testRealRoom.getRoomSize());

    }
}