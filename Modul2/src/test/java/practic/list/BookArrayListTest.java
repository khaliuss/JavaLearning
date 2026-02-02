package practic.list;

import org.junit.Before;
import org.junit.Test;
import practic.classes.Book;

import static org.junit.Assert.*;

public class BookArrayListTest {

    BookList bookList;


    @Before
    public void setUp() throws Exception {
        bookList = new BookLinkedList();
        for (int i = 0; i < 5; i++) {
            bookList.add(new Book(i,"Book"+i));
        }
    }

    @Test
    public void methodGetReturnBookThetWeRequire() {
        Book book = bookList.getBook(0);
        assertEquals("Book0",book.getName());
    }

    @Test
    public void when1ElementAddedThenSizeIncrease1() {
        bookList.add(new Book(5,"Book5"));
        assertEquals(6,bookList.size());
    }

    @Test
    public void when1ElementRemovedThenSizeDecrease1() {
        Book book = bookList.getBook(0);
        assertTrue(bookList.remove(book));
        assertEquals(4,bookList.size());
        assertFalse(bookList.remove(book));
    }

    @Test
    public void when1ElementRemovedAtThenSizeDecrease1() {
        assertTrue(bookList.removeAt(4));
        assertEquals(4,bookList.size());
        assertFalse(bookList.removeAt(4));
    }


    @Test
    public void whenMethodClearCalledThenClearAll() {
        bookList.clear();
        assertEquals(0,bookList.size());
    }
}