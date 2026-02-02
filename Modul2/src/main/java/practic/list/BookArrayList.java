package practic.list;

import practic.classes.Book;

public class BookArrayList implements BookList {

    private Book[] array = new Book[10];
    int size = 0;

    @Override
    public Book getBook(int index) {
        return array[index];
    }

    @Override
    public void add(Book book) {

        if (size >= array.length) {
            increaseArray();
        }

        array[size] = new Book(size, "Book" + size);
        size++;

    }

    private void increaseArray() {
        Book[] newArray = new Book[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public boolean remove(Book book) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].equals(book)) {
                    for (int j = i; j < array.length; j++) {
                        array[i] = array[j];
                    }
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        Book book = getBook(index);
        if (book != null) {
            remove(getBook(index));
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Book[10];
        size=0;
    }
}
