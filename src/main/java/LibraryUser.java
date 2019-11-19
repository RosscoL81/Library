import java.util.ArrayList;

public class LibraryUser {

    private ArrayList<Book> collection;

    public LibraryUser(){
        this.collection = new ArrayList<Book>();
    }


    public int collectionSize() {
        return this.collection.size();
    }


    public void addBook(Book book) {
        this.collection.add(book);
    }

    public void collectFromLibrary(Library library) {
        Book bookTaken = library.removeBook();
    }
}
