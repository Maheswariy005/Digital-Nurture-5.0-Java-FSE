package com.cognizant.service;

import com.cognizant.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void addBook() {

        System.out.println("Inside BookService");

        bookRepository.saveBook();
    }
}