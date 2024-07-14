import java.util.ArrayList;

public class TestBook {
    

    public static void main(String[] args) {
        Book myBook1 = new Book("Java All-in-one for Dummies", "Doug Lowe", "1119986648", 34.99, 21, 7);
        Book myBook2 = new Book("Mastering Java", "William Buchanan", "029574426X", 6.9920, 81, 1998);

        ArrayList<Book> store =  new ArrayList<>();

        store.add(myBook1);
        store.add(myBook2);

        for (Book eachBook : store) {
            System.out.println(eachBook);
            // This method above returns the tooString method even when the tooString() method is not added in the printout. But whenever the tooString() method is commented from the Book Class, it returns the memory location of the objecs created
            
        }

        // System.out.println(myBook1.getAuthor() + "\n");
        // System.out.println(myBook2);
    }



}
