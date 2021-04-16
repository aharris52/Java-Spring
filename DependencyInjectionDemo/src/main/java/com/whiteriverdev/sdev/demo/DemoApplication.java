package com.whiteriverdev.sdev.demo;

import com.whiteriverdev.sdev.demo.model.books.Book;
import com.whiteriverdev.sdev.demo.model.books.Library;
import com.whiteriverdev.sdev.demo.model.shelves.DigitalBookShelf;
import com.whiteriverdev.sdev.demo.model.shelves.WoodenBookShelf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        //get the Spring container
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        //access all the stuff in my container
        DigitalBookShelf shelf = context.getBean(DigitalBookShelf.class);
        shelf.add(new Book("0-09-112100-0", "Michael Moorcock", "The Elrich Saga"));

        WoodenBookShelf shelf1 = context.getBean(WoodenBookShelf.class);
        shelf1.add(new Book("0-679-78589-2", "Hunter S. Thompson", "Fear and Loathing in Las Vegas"));

        Library library = context.getBean(Library.class);
        System.out.println(library);

    }

}
