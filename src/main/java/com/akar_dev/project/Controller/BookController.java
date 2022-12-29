package com.akar_dev.project.Controller;


import com.akar_dev.project.Entity.Book;
import com.akar_dev.project.Entity.Department;
import com.akar_dev.project.ServiceImplementation.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {
    @Autowired
    BookServiceImpl bookServiceImpl;

    @PostMapping("/addBook")
    private Book addBook(@RequestBody Book book, Department department) {
        return bookServiceImpl.addBooks(book, department);
    }

    @GetMapping("/getBooks")
    private List<Book> retrieveBooks() {

        return bookServiceImpl.retrieveBook();
    }

    @PutMapping("/updateBook/{id}")
    public Book updateBook(@PathVariable("id") Long bookID, @RequestBody Book book) {
        return bookServiceImpl.updateBook(bookID, book);
    }
    @DeleteMapping("/delBook/{id}")
    public String deleteBook(@PathVariable("id") Long bookID , @RequestBody Book book){
        bookServiceImpl.deleteBook(bookID , book);
        return "Deleted Successfully";
    }

}
