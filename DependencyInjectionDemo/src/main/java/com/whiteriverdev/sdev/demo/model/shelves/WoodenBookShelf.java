package com.whiteriverdev.sdev.demo.model.shelves;

import com.whiteriverdev.sdev.demo.model.books.Book;
import org.springframework.stereotype.Component;

@Component
public class WoodenBookShelf implements IBookShelf
{
    public WoodenBookShelf()
    {
        System.out.println();
    }

    public void add(Book book)
    {
        System.out.println("Book added to wooden shelf");
    }

    public boolean remove(Book book)
    {
        return false;
    }

    public boolean contains(Book book)
    {
        return false;
    }
}
