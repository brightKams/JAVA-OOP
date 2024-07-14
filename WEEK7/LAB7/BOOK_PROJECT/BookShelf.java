import java.util.ArrayList;

public class BookShelf {

    private int max_capacity;
    private ArrayList<Book> books;

    public BookShelf(Book books, int max_capacity) {
        this.max_capacity = max_capacity;
        this.books = new ArrayList<Book>();

    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public boolean isBookInShelf(Book book) {
        // for(Book eachBook : books) {
        // if(eachBook == book) {
        // return true;
        // }
        // }

        // OR
        // if (books.contains(book)) {
        // return true;
        // }
        // return false;

        // OR
        // boolean inshelf = books.contains(book) ? true : false;
        // return inshelf;

        // OR

        return this.books.contains(book);

        // All of the above codes will return same kind of result, which is a boolean of either a true or false value.
    }

    public void displayBook(Book book) {
        int bookIndex = books.indexOf(book); //This returns the index position of a specific book. However, if the book is

        if (bookIndex >= 0) {
            Book foundBook = books.get(bookIndex);
            System.out.println(foundBook.toString());

        } else {
            System.out.println("Book is not found on this shelf");
        }

        // OR
        // if(isBookInShelf(book) == true) {
        //     System.out.println(book.toString());
        // }

    }

    public void displayallBooks() {
        for (Book eachBook : books) {
            System.out.println(eachBook.toString());
        }
    }

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(null, 0);

        Book myBook1 = new Book("Java All-in-One For Dummies", "Doug Lowe", "1119986648", 34.99, 21, 7);
        Book myBook2 = new Book("Mastering Java", "William Buchanan", "029574426X", 6.99, 81, 1998);
        Book myBook3 = new Book("Java in easy steps", "Mike McGrath", "NA", 10.99, 0.10, 7);
        Book myBook4 = new Book("Effective Java", "Joshua BLoch", "0134685997", 4.49, 6, 3);

        bookShelf.addBook(myBook1);
        bookShelf.addBook(myBook2);
        bookShelf.addBook(myBook3);
        bookShelf.addBook(myBook4);
        System.out.println("All Books in the bookshelf: \n");
        bookShelf.displayallBooks();
    }

}
