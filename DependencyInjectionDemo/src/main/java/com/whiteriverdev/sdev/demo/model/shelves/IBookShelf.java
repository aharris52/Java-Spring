package com.whiteriverdev.sdev.demo.model.shelves;

import com.whiteriverdev.sdev.demo.model.books.Book;

public interface IBookShelf
{
    public void add(Book book);
    public boolean remove(Book book);
    public boolean contains(Book book);
}

