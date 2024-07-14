public abstract class Booking {

    String bookingNumber;
    String customerName;
    String bookingDate;

    public Booking(String bookingDate, String bookingNumber, String customerName){
        this.customerName = customerName;
        this.bookingNumber = bookingNumber;
        this.bookingDate = bookingDate;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getBookingNumber(){
        return this.bookingNumber;
    }

    public String getBookingDate(){
        return this.bookingDate;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setBookingNumbere(String bookingNumber){
        this.bookingNumber = bookingNumber;
    }

     public void setBookingDate(String bookingDate){
        this.bookingDate = bookingDate;
    }

    public abstract String getDetails();

    public String toString(){
        String st = "";
        st += "Customer Name: " + this.customerName + " ";
        st += "\nBooking Number: " + this.bookingNumber;
        st += "\nBooking Date: " + this.bookingDate;
        st += "\nBooking Details";
        st += "\n*****************************";
        st += getDetails();
        st += "\n*****************************";
        return st;
    }

    
}
