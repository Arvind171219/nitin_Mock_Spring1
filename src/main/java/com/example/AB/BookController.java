package com.example.AB;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add-book")
    public ResponseEntity addBook(@RequestBody Book book){
        String messg = bookService.addBook(book);
        return new ResponseEntity(messg, HttpStatus.ACCEPTED);
    }

    @GetMapping("bookof heighest_pags")
    public ResponseEntity findBookwithheighestPage(){
        String bookName = bookService.findBookwithheighestPage();
            return  new ResponseEntity<>(bookName,HttpStatus.CREATED);
    }
    @PutMapping("upfatebook_pages")

    public ResponseEntity updateBookPage(@RequestParam("bookName") String bookName,@RequestParam("extraPage")int extraPage){
        bookService.updateBookPage(bookName,extraPage);
        return new ResponseEntity<>("Page updated successfully",HttpStatus.ACCEPTED);
    }
}
