import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public  class Booking{

    String passengerName;
    Date date;
    int busNo;
    Scanner sc=new Scanner(System.in);

    Booking(){
        System.out.println("enter name");
        passengerName=sc.next();
        System.out.println("enter busNo");
        busNo= sc.nextInt();
        System.out.println("date");
        String dateInput=sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings)
    {
        int capacity=0;
        for(Bus bus:buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
            }
        }
            int booked=0;
            for(Booking b:bookings) {
                if(b.busNo == busNo && b.date.equals(date)) {
                    booked++;
                }
            }
            return booked<capacity?true:false;

    }

}