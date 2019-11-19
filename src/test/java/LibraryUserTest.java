import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryUserTest {

    Library library
    LibraryUser libraryUser;
    Book book;

    @Before
    public void before(){
        library = new Library(4)
        libraryUser = new LibraryUser();
        book = new Book("Football: My Life, My Passion", "Graeme Souness", "autobiography");
    }

    @Test
    public void canAddToCollection(){
        libraryUser.addBook(book);
        assertEquals(1,libraryUser.collectionSize());
    }

    @Test
    public void canAddToCollectionFromLibrary(){
        libraryUser.collectFromLibrary(library);
        assertEquals(1,libraryUser.collectionSize());
        assertEquals(0, library.bookCount());
    }

}
