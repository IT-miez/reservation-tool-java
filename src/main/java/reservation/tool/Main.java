package reservation.tool;

public class Main {
    public static void main(String[] args) {
        RoomWithEquipment testRoom = new RoomWithEquipment(3471, 10, 2, 4, 10);
        RoomWithEquipment testRoom2 = new RoomWithEquipment(4371, 10, 2, 4, 10);

        ReservationMaker RM = ReservationMaker.getInstance();
        ReservationMaker RM2 = ReservationMaker.getInstance();
        System.out.println("Hashcode of RM:" + RM.hashCode());
        System.out.println("Hashcode of RM2:"+ RM2.hashCode());
        System.out.println("Both objects of the ReservationMaker have same hashcode.\n");
        System.out.println("Hashcode of RoomWithEquipment-object:"+ testRoom.hashCode());
        System.out.println("Hashcode of another RoomWithEquipment-object:"+ testRoom2.hashCode());
        System.out.println("Two RoomWithEquipment-objects have different hashcode, as they are not Singleton-class objects.");

        System.out.println(testRoom.getRoomNumber());
    }
}