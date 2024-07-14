public class FlightBooking extends Booking {

    public Airline airline;
    public String flightNumber;
    public double price;

    public FlightBooking(String bookingDate, String bookingNumber, String customer, Airline airline,
            String flightNumber, double price) {
        super(bookingDate, bookingNumber, customer);
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.price = price;
    }

    public Airline getAirline() {
        return this.airline;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public double getPrice() {
        return this.price;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        String st = "";
        st += "\nAirline: " + getAirline() + " ";
        st += "FlightNumber: " + getFlightNumber();
        st += "\nPrice: " + getPrice();
        return st;

    }

}
