package com.whiteriverdev.sdev.demo.model.shelves;

import com.whiteriverdev.sdev.demo.model.books.Book;
import org.springframework.stereotype.Component;

@Component
public class DigitalBookShelf implements IBookShelf
{
    public DigitalBookShelf()
    {
        System.out.println();
    }

    public void add(Book book)
    {
        System.out.println("Book added to digital shelf");
    }

    public boolean remove(Book book)
    {
        //do something...
        return false;
    }

    public boolean contains(Book book)
    {
        //do something...
        return false;
    }
}
