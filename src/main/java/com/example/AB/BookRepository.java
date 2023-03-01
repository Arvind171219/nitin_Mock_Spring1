package com.example.AB;


import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepository {


    HashMap<String ,Book> book_db = new HashMap<>();

    public String addBook(Book book) {
       if(book_db.containsKey(book.getBookName())){
           return "Book is already present";
       }
       book_db.put(book.getBookName(),book);
       return "Book is Added successfully";
    }

    public String findBookwithheighestPage() {
        String bookName="";
        int maxpages=0;

        for(Book book :book_db.values()){
            if(book.getPages()>maxpages){
                maxpages=book.getPages();
                bookName=book.getBookName();
            }
        }
        return bookName;
    }

    public void updateBookPage(String bookName, int extraPage) {
        int old_page = book_db.get(bookName).getPages();
        book_db.get(bookName).setPages(old_page+extraPage);
    }
}
