package AssignmentOne;


public class ResortReservation extends Reservation {
    private int MAX_ROOMS=199;
    int room_no;

    public ResortReservation(long reservationID, String costomer_name, String date, int room_no){
        super(reservationID, costomer_name, date);
        this.room_no = room_no;
    }

    public void checkReservationStatus(){
        System.out.println("Your Room is Booked.");
        System.out.println("XYZ Hotel,\nName : "+costomer_name+"\nID"+reservation_ID+"\nDate for Stay : "+date+ "\nRoom No : "+room_no);
    }

}
