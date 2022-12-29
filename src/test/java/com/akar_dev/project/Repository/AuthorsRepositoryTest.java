package com.akar_dev.project.Repository;

import com.akar_dev.project.Entity.Authors;
import com.akar_dev.project.Entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class AuthorsRepositoryTest {

    @Autowired
    private AuthorsRepository authorsRepository;

    @Test
    void addAuthors() {
        Book book1 = Book.builder()
                .bookID(1L)
                .bookName("programming")
                .availability(true)
                .bookIdentificationNumber(1111)
                .bookLanguage("english")
                .bookPrice(22)
                .bookPublisher("Hakim")
                .build();
        Book book2 = Book.builder()
                .bookName("networking")
                .availability(true)
                .bookIdentificationNumber(2233)
                .bookLanguage("english")
                .bookPrice(22)
                .bookPublisher("aland")
                .build();
        List<Book> books =
                new ArrayList<>();
        books.add(book1);
        books.add(book2);
        Authors authors = Authors.builder()
                .authID(1L)
                .authFName("Akar")
                .authLName("arkan")
                .authEmail("akar.arkanf19@komar.edu.iq")
                .authPassword("1122")
                .book(List.of(book1, book2))
                .build();
        authorsRepository.save(authors);
    }
}