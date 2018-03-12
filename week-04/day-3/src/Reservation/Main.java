package Reservation;

public class Main {
    public static void main(String[] args) {
        Reservation reservationApp = new Reservation();
        for (int i = 0; i < 10; i++) {
            System.out.println("Booking# " + reservationApp.getCodeBooking() +
                    " for " + reservationApp.getDowBooking());
        }
    }
}
