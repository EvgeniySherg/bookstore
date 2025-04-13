package com.example.bookstore.controllers;

import com.example.bookstore.dto.BookDto;
import com.example.bookstore.models.Book;
import com.example.bookstore.repositories.BookRepository;
import com.example.bookstore.services.BookService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // мы же обмениваемся json
@RequestMapping("/books") // пусть корневой путь будет /books
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
        public List<Book> getBooks() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") Long id) {
        return bookService.findById(id);
    }

    @PostMapping
    public Book saveBook(Book book) {
        return bookService.save(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable("id") Long id) {
        bookService.deleteById(id);
        System.out.println("Книга с id -" + id + ", удалена из БД");

    }



}
