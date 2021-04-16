package com.whiteriverdev.sdev.demo.model.di;

import com.whiteriverdev.sdev.demo.model.books.Book;
import com.whiteriverdev.sdev.demo.model.books.BookCollection;
import com.whiteriverdev.sdev.demo.model.shelves.DigitalBookShelf;
import com.whiteriverdev.sdev.demo.model.shelves.IBookShelf;
import com.whiteriverdev.sdev.demo.model.shelves.WoodenBookShelf;

public class DITest {

    public static void main(String[] args) {

        IBookShelf shelf = new DigitalBookShelf();
        IBookShelf anotherShelf = new WoodenBookShelf();
        BookCollection collection = new BookCollection((DigitalBookShelf) shelf);

        collection.addBookToShelf(new Book("","Michael Moorcock","The Elrich Saga"),
                                  new Book("0-571-05686-5", "Lord of the Flies", "William Golding"));
    }
}
