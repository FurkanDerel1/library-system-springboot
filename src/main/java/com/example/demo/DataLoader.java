package com.example.demo;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final BookRepository repository;

    public DataLoader(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            repository.save(new Book("The Pragmatic Programmer", "David Thomas", "978-0135957059"));
            repository.save(new Book("Clean Architecture", "Robert C. Martin", "978-0134494166"));
            repository.save(new Book("Design Patterns", "Erich Gamma", "978-0201633610"));
            repository.save(new Book("Head First Java", "Kathy Sierra", "978-1491910771"));
        }
    }
}
