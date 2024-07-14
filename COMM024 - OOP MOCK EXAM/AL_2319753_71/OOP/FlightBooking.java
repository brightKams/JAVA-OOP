package OOP;
public class FlightBooking extends Booking {
   
    public Airline airline;
    public String flightNumber;
    public double price;

    public FlightBooking(String bookingDate, String customerName, String bookingNumber, Airline airline, String flightNumber, double price) {
        super(bookingDate, customerName, bookingNumber);
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.price = price;
    }

    // GETTERS 
     public Airline getAirline() {
        return airline;
    }
    public void setAirline(Airline airline) {
        this.airline = airline;
    }
    public String getFlightNumber() {
        return flightNumber;
    }

    //  END OF GETTERS

    // SETTERS
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // END OF SETTERS

    public String getdetails() {
        String st = "Customer Name: " + 
        this.customerName + "\nBooking Number: " + 
        this.bookingNumber + "\nBooking Date: " + 
        this.bookingDate + "\nAirline: " + 
        this.airline;

        return st;
    }

    public String toString() {
        return getdetails();
    }

}
