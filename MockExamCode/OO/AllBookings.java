import java.util.ArrayList;

public class AllBookings {

    private ArrayList<Booking> bookings;


    public AllBookings(){
        bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking){
        bookings.add(booking);
    }

    public void removeBooking(Booking booking){
        bookings.remove(booking);
    }

    public void listAllBooking(){
        for (Booking booking : bookings){
            if(booking instanceof HotelBooking){
                System.out.println("Hotel Booking");
            }else{
                System.out.println("Flight Booking");
            }
            System.out.println(booking);
            System.out.println();
        }
    }

    public static void main(String[] args){
        AllBookings allBookings = new AllBookings();
        Booking booking1 = new FlightBooking("14/11/2023", "B234", "JCG", Airline.KLM, "KL1446", 241.54);
        Booking booking2 = new HotelBooking("17/11/2023", "F456", "David", RoomType.SINGLE, 146, 2, 190.75);
        allBookings.addBooking(booking1);
        allBookings.addBooking(booking2);
        allBookings.listAllBooking();
    }
    
}
