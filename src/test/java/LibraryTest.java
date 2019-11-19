import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void before() {
        library = new Library(4);
        book1 = new Book("Football: My Life, My Passion", "Graeme Souness", "autobiography");
        book2 = new Book("The Midnight Line", "Lee Child", "Fiction");
        book3 = new Book("I, Alex Cross", "James Patterson", "Fiction");
        book4 = new Book("My Life in Parts", "Bryan Cranston", "Autobiography");
        book5 = new Book("The Burning Wire", "Jeffrey Deaver", "Fiction");
    }

    @Test
    public void bookCountStartsAt0() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToStock() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBookToStock() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void canRemoveABook() {
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.bookCount());
    }

}

