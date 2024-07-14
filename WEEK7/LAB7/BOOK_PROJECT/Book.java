public class Book {
    private String title;
    private String author;
    private double price;
    private String isdn;
    private int editionNo;
    private double discount;

    public Book(String title, String author, String isdn, double price,  double discount, int editionNo) {

        this.title = title;
        this.author = author;
        this.isdn = isdn;
        this.price = price;
        this.discount = discount;
        this.editionNo = editionNo;
    }
// CREATING SETTER METHODS

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    

    public void setISDN(String newISDN) {
        this.isdn = newISDN;
    }

    public void setEditionNo(int newSetEditionNo){
        this.editionNo = newSetEditionNo;
    }

    public void setDiscount(double newDiscount) {
        this.discount = newDiscount;
    }

    // CREATING GETTER METHODS

    public String getTitle(){

        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    public String getISDN() {
        return this.isdn;
    }

    public int getEditionNo() {
        return this.editionNo;
    }

    public double getDiscount() {
        return this.discount;
    }

// END OF CREATING GETTER METHODs

// CREATING A TRANSFORMER METHODs

public void changePrice(double discountRate) {
    double discountValue = this.discount * discountRate;
    discount += discountValue;
}

public void increasePrice(double percentRate){
    double newPrice;
    newPrice = (percentRate*this.price/100);
    this.price += newPrice ;
}

public void increaseEditionNo(){
    this.editionNo++;
}

public void decreaseEditionNo(){
    this.editionNo--;
}

// CREATING TOSTRING() METHOD

public String toString(){
    String book_details = "";

    book_details += "Book Title: " + this.title + "\n";
    book_details += "Book Author: " + this.author + "\n";
    book_details += "Book ISDN: " + this.isdn + "\n";
    book_details += "Book Price: " + this.price + "\n";
    book_details += "Discount Price: " + this.discount + "\n";
    book_details += "Book Edition No: " + this.editionNo + "\n";
  
    return book_details;
}
// public String toString2(){
//     String book_details = "";

//     book_details += "Book Title: " + this.title + "\n";
//     book_details += "Book Author: " + this.author + "\n";
//     book_details += "Book ISDN: " + this.isdn + "\n";
//     book_details += "Book Price: " + this.price + "\n";
//     book_details += "Discount Price: " + this.discount + "\n";
//     book_details += "Book Edition No: " + this.editionNo + "\n";
  
//     return book_details;
// }



public static void main(String[] args){
    Book myBook = new Book("Java All-in-one for Dummies", "Doug Lowe", "1119986648", 34.99, 21, 7);
    System.out.println(myBook);
    // System.out.println(myBook.toString2());

    
    // System.out.println();
}
}



