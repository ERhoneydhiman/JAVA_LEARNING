package AssignmentOne;

public class Reservation {
//    28.   Write a Java program to create a class called "Reservation" with attributes
//          for reservation ID, customer name, and date. Create subclasses
//          "ResortReservation" and "RailwayReservation" that add specific attributes like
//          room number for hotels and seat number for flights. Implement methods to
//          check reservation status and modify reservation details.

    final long reservation_ID;
    String costomer_name;
    String date;

    public Reservation(long reservationID, String costomer_name, String date) {
        this.reservation_ID = reservationID;
        this.costomer_name = costomer_name;
        this.date = date;
    }
}
