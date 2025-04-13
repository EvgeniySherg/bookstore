package com.example.bookstore.services;

import com.example.bookstore.mappers.BookMapper;
import com.example.bookstore.models.Book;
import com.example.bookstore.repositories.BookRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    @Getter
    private final BookMapper bookMapper;

//    @Autowired
//    public BookService(BookRepository bookRepository) {  // заменить метод на аннотацию @requiredArgsConstructor?
//        this.bookRepository = bookRepository;
//    }

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
