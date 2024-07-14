public class HotelBooking extends Booking{

    public RoomType roomType;
    public int roomNumber;
    public int numberNights;
    public double price;

    public HotelBooking(String bookingDate, String bookingNumber, String customer, 
        RoomType roomType, int roomNumber, int numberNights, double price) {
        super(bookingDate, bookingNumber, customer);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.numberNights = numberNights;
        this.price = price;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getNumberNights() {
        return this.numberNights;
    }

    public double getPrice() {
        return this.price;
    }

    public void setRoomType( RoomType roomType) {
        this.roomType = roomType;
    }

    // public void setRoomNumber(int roomNumber) {
    //     this.roomNumber = roomNumber;
    // }

    public void setNumberNights(int numberNights) {
        this.numberNights = numberNights;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        String st = "";
        st += "\nRoom Type " + getRoomType() + " ";
        st += "Room Number " + getRoomNumber() + " ";
        st += "Number Nights " + getNumberNights();
        st += "\nPrice " + getPrice();
        return st;

    }
    
}
