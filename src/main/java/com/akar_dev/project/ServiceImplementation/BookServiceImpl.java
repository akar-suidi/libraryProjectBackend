package com.akar_dev.project.ServiceImplementation;

import com.akar_dev.project.Entity.Authors;
import com.akar_dev.project.Entity.Book;
import com.akar_dev.project.Entity.Department;
import com.akar_dev.project.Repository.BookRepository;
import com.akar_dev.project.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book addBooks(Book book, Department department) {
        return bookRepository.save(book);
    }


    @Override
    public void deleteBook(Long bookID , Book book) {
        bookRepository.deleteById(bookID);
    }

    @Override
    public List<Book> retrieveBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book updateBook(Long bookID, Book book) {
        Book bookDB = bookRepository.findById(bookID).get();
        if(Objects.nonNull(book.getBookName()) &&
                !"".equalsIgnoreCase(book.getBookName())) {
            bookDB.setBookName(book.getBookName());
        }
        if(Objects.nonNull(book.getBookLanguage()) &&
                !"".equalsIgnoreCase(book.getBookLanguage())) {
            bookDB.setBookLanguage(book.getBookLanguage());
        }
        if(Objects.nonNull(book.getBookPublisher()) &&
                !"".equalsIgnoreCase(book.getBookPublisher())) {
            bookDB.setBookPublisher(book.getBookPublisher());
        }
        if(Objects.nonNull(book.getBookPrice())) {
            bookDB.setBookPrice(book.getBookPrice());
        }
        return bookRepository.save(bookDB);
    }
}
