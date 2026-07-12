package com.cognizant.service;

import com.cognizant.repository.BookRepository;

public class BookService {

    private BookRepository constructorRepository;
    private BookRepository setterRepository;

    // Constructor Injection
    public BookService(BookRepository constructorRepository) {
        this.constructorRepository = constructorRepository;
    }

    // Setter Injection
    public void setSetterRepository(BookRepository setterRepository) {
        this.setterRepository = setterRepository;
    }

    public void addBook() {

        System.out.println("Using Constructor Injection:");
        constructorRepository.saveBook();

        System.out.println("Using Setter Injection:");
        setterRepository.saveBook();
    }
}