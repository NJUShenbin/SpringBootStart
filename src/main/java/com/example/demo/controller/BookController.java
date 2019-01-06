package com.example.demo.controller;

import com.example.demo.repository.BookRepository;
import com.example.demo.vo.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/books")
    List<BookEntity> books(){
        return bookRepository.findAll();
    }

    @RequestMapping("/book")
    List<BookEntity> queryBookByLanguage(@RequestParam String language){
        return bookRepository.findByLanguage(language);
    }


}
