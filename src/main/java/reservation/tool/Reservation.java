package reservation.tool;
import java.time.LocalDate;

public class Reservation {
    
    private Customer customer;
    private RoomWithEquipment roomWithEquipment;
    private LocalDate timeslot;

    public Reservation(Customer customer, RoomWithEquipment roomWithEquipment, LocalDate timeslot) {
        // Make a Reservation-object with necessary information
        this.customer = customer;
        this.roomWithEquipment = roomWithEquipment;
        this.timeslot = timeslot;
    }
}

