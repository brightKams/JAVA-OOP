package OOP;

import java.util.ArrayList;

public class AllBookings {

    ArrayList<Booking> bookings;
    ArrayList<HotelBooking> hotelBookings;
    ArrayList<FlightBooking> airlineBookings;
    public AllBookings() {
        bookings = new ArrayList<>();
        hotelBookings = new ArrayList<>();
        airlineBookings = new ArrayList<>();
        
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
    public void addAirlineBooking(FlightBooking airlineBooking) {
        airlineBookings.add(airlineBooking);
    }
    public void addHotelBooking(HotelBooking hotelBooking) {
        hotelBookings.add(hotelBooking);
    }

    public void removeBooking(Booking booking) {
        bookings.remove(booking);
    }

    public void listAllBooking() {
        for (Booking booking : bookings) {
            if (booking instanceof FlightBooking) {
                FlightBooking flight = (FlightBooking) booking;
                airlineBookings.add(flight);
                System.out.println(flight.toString() + "\n");
            } else if (booking instanceof HotelBooking) {
                HotelBooking hotel = (HotelBooking) booking;
                hotelBookings.add(hotel);
                System.out.println(hotel.toString() + "\n");
            }  
        }
    }
    
    public ArrayList<FlightBooking> getAirlineBookings(){
        // airlineBookings = new ArrayList<>();
        //  for (Booking booking : bookings) {
        //     if(booking instanceof FlightBooking){
        //         FlightBooking airline = (FlightBooking) booking;
        //         airlineBookings.add(airline);
        //     }
        // }
        System.out.println(airlineBookings + "\n");
        return airlineBookings;
    }
    public void getHotelBookings(){

        // hotelBookings = new ArrayList<>();

        // for (Booking booking : bookings) {
        //     if(booking instanceof HotelBooking ) {
        //         HotelBooking hotel = (HotelBooking) booking;
        //         hotelBookings.add(hotel);
        //     } 
        // }
        System.out.println(hotelBookings + "\n");
    }

    public static void main(String[] args) {
        AllBookings allBookings = new AllBookings();
        Booking hotelBooking1 = new HotelBooking("17/11/2023", "David", "F246", RoomType.SINGLE, 146, 0, 10);

        Booking flightBooking1 = new FlightBooking("14/11/2023", "JCG", "B234", Airline.KLM, "KL1446", 5.0);

        // ADDING ALL BOOKINGS TO A GENERAL ARRAY
        allBookings.addBooking(flightBooking1);
        allBookings.addBooking(hotelBooking1);

        // PRINTING OUT ALL BOOKING CLASSES
        // allBookings.listAllBooking();
        // flightBooking1.toString();
        // allBookings.flightBooking1();

        // Printing out Specific Booking Classes from the Testing Class
        allBookings.getAirlineBookings();
        allBookings.getHotelBookings();
    
    }
}
