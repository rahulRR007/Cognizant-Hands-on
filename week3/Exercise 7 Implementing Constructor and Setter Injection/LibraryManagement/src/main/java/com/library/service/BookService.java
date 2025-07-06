package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String libraryName;
    private BookRepository bookRepository;

    // Constructor injection
    public BookService(String libraryName) {
        this.libraryName = libraryName;
        System.out.println("BookService: Library set via constructor - " + libraryName);
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookService: BookRepository set via setter");
    }

    public void addBook(String bookName) {
        System.out.println("BookService: Adding book to " + libraryName);
        bookRepository.save(bookName);
    }
}
