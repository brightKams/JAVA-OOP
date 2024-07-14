public abstract class Booking {
    String bookingNumber, customerName, bookingDate ;

    

    public Booking(String bookingNumber, String customerName, String bookingDate){
        this.bookingNumber = bookingNumber;
        this.customerName = customerName;
        this.bookingDate = bookingDate;
    };

    // SETTING GETTERS
    public String getBookingDate() {
        return bookingDate;
    }
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    // SETTERS
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }
    public String toString(){
        return "";
    }

    public abstract String getDetails();
    public static void main(String[] args) {
        
    }
}
