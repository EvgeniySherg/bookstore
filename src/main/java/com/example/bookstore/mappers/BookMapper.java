package com.example.bookstore.mappers;

import com.example.bookstore.dto.BookDto;
import com.example.bookstore.models.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {
    Book toBook(BookDto bookDto);
    BookDto toDto(Book book);
}
