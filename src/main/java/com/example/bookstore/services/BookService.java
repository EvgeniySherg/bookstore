package com.example.bookstore.services;

import com.example.bookstore.dto.BookDto;
import com.example.bookstore.mappers.BookMapper;
import com.example.bookstore.models.Book;
import com.example.bookstore.repositories.BookRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
//@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Autowired
    public BookService(BookRepository bookRepository, BookMapper bookMapper) {  // заменить метод на аннотацию @requiredArgsConstructor?
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    public List<BookDto> findAll() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .collect(Collectors.toList());
    }

    public BookDto findById(long id) {
        return bookRepository.findById(id)
                .map(bookMapper::toDto)
                .orElseThrow(() ->
                new RuntimeException("Book not found"));
    }

    public BookDto save(BookDto bookDto) {
        Book book = bookMapper.toEntity(bookDto); // превращаем Dto сущность в совместимую с БД
        Book bookSaved = bookRepository.save(book); // сохраняем конвертированную сущность в БД

        return bookMapper.toDto(bookSaved);
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
