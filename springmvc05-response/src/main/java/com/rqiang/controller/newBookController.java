package com.rqiang.controller;

import com.rqiang.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/newbooks")
public class newBookController {
    @PostMapping
    public String save(Book book){
        System.out.println("book save ==>" + book);
        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        Book book1 = new Book();
        book1.setName("lifeStyle");
        book1.setType("society");
        book1.setDescription("level one");

        Book book2 = new Book();
        book2.setName("computer");
        book2.setType("engineer");
        book2.setDescription("level two");

        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        return books;
    }
}
