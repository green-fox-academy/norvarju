package Reservation;

import java.util.Random;

public class Reservation implements Reservation.Reservationy {

    private String dowBooking;
    private String codeBooking;

    public Reservation() {
        this.dowBooking = dowBooking;
        this.codeBooking = codeBooking;
    }

    @Override
    public String getDowBooking() {
        String weekDay[] = {"MON", "TUE", "WED", "THU", "FRI", "SAT",
                "SUN" };
        StringBuilder getCode = new StringBuilder();
        Random rnd = new Random();
            int index = (int) (rnd.nextFloat() * weekDay.length);
            getCode.append(weekDay[index]);
        String randomWeekDay = getCode.toString().toUpperCase();
        return randomWeekDay;
    }

    @Override
    public String getCodeBooking() {
        String randomChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder getCode = new StringBuilder();
        Random rnd = new Random();
        while (getCode.length() < 8) { // length of the random string.
            int index = (int) (rnd.nextFloat() * randomChars.length());
            getCode.append(randomChars.charAt(index));
        }
        String randomString = getCode.toString().toUpperCase();
        return randomString;
    }

    public void result(){

    }
}
