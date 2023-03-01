package com.example.AB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public String addBook(Book book) {
        return bookRepository.addBook(book);
    }

    public String findBookwithheighestPage() {
        return bookRepository.findBookwithheighestPage();
    }

    public void updateBookPage(String bookName, int extraPage) {
        bookRepository.updateBookPage(bookName,extraPage);
    }
}
