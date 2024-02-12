import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


    ArrayList<Bus> buses=new ArrayList<Bus>();
    ArrayList<Booking> bookings=new ArrayList<Booking>();
    buses.add(new Bus(1,50));
    buses.add(new Bus(2,40));
    Scanner sc=new Scanner(System.in);
    for(Bus b:buses)
    {
        b.displayBusInfo();
    }
    while(true)
    {
        System.out.println("Enter choice 1 to book ticket, 2 to cancel ticket, 3 to exit");
         int choice=sc.nextInt();

         switch (choice)
         {
             case 1:
                  Booking booking=new Booking();
                  if(booking.isAvailable(buses,bookings))
                  {
                      bookings.add(booking);
                      System.out.println("Your bookig is confirmed");
                  }
                  break;

             case 2:
                 System.out.println("enter id");
                 int customerId=sc.nextInt();
                 //Booking booking=new Booking();
               //  Booking.cancelticket(customerId);
                 System.out.print("Your ticket canceled");
                 break;
             case 3:
                 System.out.print("Thanks for using my service ");
                 break;
         }
    }
}
}