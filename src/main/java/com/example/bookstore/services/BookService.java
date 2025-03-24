package com.example.bookstore.services;

import com.example.bookstore.models.Book;
import com.example.bookstore.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {  // заменить метод на аннотацию @requiredArgsConstructor?
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(long id) {
        return bookRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Book not found"));
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void deleteById(long id) {
        bookRepository.deleteById(id);
    }


//    public void updateBook(Long id, Book book) { // явный update
//        Book oldBook = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
//        oldBook.setName(book.getName());
//        oldBook.setAuthor(book.getAuthor());
//        oldBook.setPublisher(book.getPublisher());
//        oldBook.setCount(book.getCount());
//        bookRepository.save(oldBook);
//    }






}
