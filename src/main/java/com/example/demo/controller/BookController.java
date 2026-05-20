package com.example.demo.controller;

import com.example.demo.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String showBooks(Model model) {
        // Fetch mock data and add it to the model
        model.addAttribute("books", bookService.getAllBooks());
        // Returns the books.html template
        return "books";
    }
}