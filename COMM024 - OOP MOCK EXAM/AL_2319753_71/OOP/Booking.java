package OOP;
public abstract class Booking {
    public String bookingNumber;
    public String customerName;
    public String bookingDate;

    public Booking(String bookingDate, String customerName, String bookingNumber) {
        this.bookingDate = bookingDate;
        this.customerName = customerName;
        this.bookingNumber = bookingNumber;
    }

    // GETTERS
    public String getCustomerName() {
        return this.customerName;
    }

    public String getBookingNumber() {
        return this.bookingNumber;
    }

    public String getBookingdate() {
        return this.bookingDate;
    }
    // END GETTERS

    // SETTERS
    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    // END OF SETTERS

    public abstract String getdetails();

    public String toString() {
        String st = "Customer Name: " + this.customerName + "\nBooking Number: " + this.bookingNumber
                + "\nBooking Date: " + this.bookingDate;

        return st;
    }

}
