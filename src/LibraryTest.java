import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Harry Potter", "Rowling");

        library.addBook(book);

        assertEquals(1, library.getBookCount());
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        Book book = new Book("Harry Potter", "Rowling");

        library.addBook(book);
        boolean removed = library.removeBook(book);

        assertTrue(removed);
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void testRemoveBookNotFound() {
        Library library = new Library();
        Book book = new Book("Harry Potter", "Rowling");

        boolean removed = library.removeBook(book);

        assertFalse(removed);
    }

    @Test
    public void testGetBookCount() {
        Library library = new Library();

        library.addBook(new Book("Book1", "Author1"));
        library.addBook(new Book("Book2", "Author2"));

        assertEquals(2, library.getBookCount());
    }
}