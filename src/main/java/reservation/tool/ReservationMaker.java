package reservation.tool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationMaker {

    // Singleton class to make reservations
    private static ReservationMaker instance = null;

    // List of Reservation objects for a in-memory implementation
    private List<Reservation> reservations = new ArrayList<>();

    private ReservationMaker() {}


    // Method to make reservations
    private void makeReservation(LocalDate timeslot, Customer reservingCustomer, RoomWithEquipment reservedRoom)
    {
        // Make reservation as an object
        Reservation newReservation = new Reservation(reservingCustomer, reservedRoom, timeslot);
        // Add reservation to a database / list of Reservations
    }
 
    // Only one instance
    public static synchronized ReservationMaker getInstance()
    {
        if (instance == null)
        instance = new ReservationMaker();
 
        return instance;
    }
}
