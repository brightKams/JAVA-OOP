package OOP;
public class HotelBooking extends Booking {

    public RoomType roomType;
    public int roomNumber;
    public int numberNights;
    public double price;

    public HotelBooking(String bookingDate, String customerName, String bookingNumber, RoomType roomType, int roomNumber, int numberNights, double price) {
        super(bookingDate, customerName, bookingNumber);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.numberNights = numberNights;
        this.price = price;
    }

    // public HotelBooking(int i, String string, String string2, String string3, int j, int k) {
    // }

    // GETTERS
    public String getBookingdate() {
        return this.bookingDate;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getookingNumber() {
        return this.bookingDate;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumberNights() {
        return numberNights;
    }

    public double getPrice() {
        return price;
    }

    // END OF GETTERS

    // SETTERS
    public String setBookingdate(String BookingDate) {
       return  this.bookingDate = BookingDate;
    }

    public void setCustomerName(String CustomerName) {
        this.customerName = CustomerName;
    }

    public void setBookingNumber(String BookingNumber) {
        this.bookingDate = BookingNumber;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNumberNights(int numberNights) {
        this.numberNights = numberNights;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // END OF SETTERS

    
    public String getdetails() {
        String st = "Customer Name: " + this.customerName + "\nBooking Number: " + 
        this.bookingNumber + "\nBooking Date: " + 
        this.bookingDate + "\nRoomType: " + 
        this.roomType;

        return st;
    }

    public String toString() {
        return getdetails();
    }

}
