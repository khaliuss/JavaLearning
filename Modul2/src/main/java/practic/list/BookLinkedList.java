package practic.list;

import practic.classes.Book;

public class BookLinkedList implements BookList {

    Node first;
    Node last;
    int size = 0;


    @Override
    public Book getBook(int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = first;
        if (first != null){
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        }
        return node.book;
    }

    @Override
    public void add(Book book) {
        if (first == null) {
            first = new Node(null, null, book);
            last = first;
            size++;
        } else {
            Node secondNode = last;
            last = new Node(secondNode, null, book);
            secondNode.next = last;
            size++;
        }
    }

    @Override
    public boolean remove(Book book) {
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    private class Node {
        private Node previous;
        private Node next;
        private Book book;

        public Node(Node previous, Node next, Book book) {
            this.previous = previous;
            this.next = next;
            this.book = book;
        }
    }
}
