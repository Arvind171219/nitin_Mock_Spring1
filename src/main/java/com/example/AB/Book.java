package com.example.AB;

public class Book {
    private String bookName;
    private String autherName;
    private int pages;


    public Book(String bookName, String autherName, int pages) {
        this.bookName = bookName;
        this.autherName = autherName;
        this.pages = pages;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
