package com.akar_dev.project.Repository;

import com.akar_dev.project.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookRepositoryTest {
    @Autowired
     BookRepository bookRepository;

    void addBook(){
        Book book = Book.builder()
                .build();
    }
}