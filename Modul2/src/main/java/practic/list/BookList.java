package practic.list;

import practic.classes.Book;

public interface BookList {

    Book getBook(int index);

    void add (Book book);

    boolean remove(Book book);

    boolean removeAt(int index);

    int size();

    void clear();
}
