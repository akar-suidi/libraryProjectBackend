package com.akar_dev.project.Service;

import com.akar_dev.project.Entity.Book;
import com.akar_dev.project.Entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    Book addBooks(Book book, Department department);
    void deleteBook(Long bookID , Book book);
    List<Book> retrieveBook();
    Book updateBook(Long bookID , Book book);
}
