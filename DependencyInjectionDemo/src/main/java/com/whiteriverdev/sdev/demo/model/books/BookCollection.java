package com.whiteriverdev.sdev.demo.model.books;

import com.whiteriverdev.sdev.demo.model.shelves.DigitalBookShelf;
import com.whiteriverdev.sdev.demo.model.shelves.IBookShelf;
import org.springframework.stereotype.Component;

@Component
public class BookCollection
{
    private DigitalBookShelf shelf;

    public BookCollection(DigitalBookShelf shelf)
    {
        this.shelf = shelf;
    }

    public void addBookToShelf(Book... books)
    {
        for (Book book : books)
        {
            shelf.add(book);
        }
    }

    public void setShelf(DigitalBookShelf shelf)
    {
        this.shelf = shelf;
    }

    public IBookShelf getShelf()
    {
        return shelf;
    }
}

