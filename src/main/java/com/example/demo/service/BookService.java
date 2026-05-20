package com.example.demo.service;

import com.example.demo.domain.Book;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    // Using this mock list instead of a real database (MariaDB) for Task 4
    private List<Book> mockBooks = Arrays.asList(
            new Book(1L, "1984", "George Orwell", "978-0451524935"),
            new Book(2L, "Dune", "Frank Herbert", "978-0441172719"),
            new Book(3L, "Clean Code", "Robert C. Martin", "978-0132350884")
    );

    public List<Book> getAllBooks() {
        return mockBooks;
    }
}