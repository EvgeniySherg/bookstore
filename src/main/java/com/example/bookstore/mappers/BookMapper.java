package com.example.bookstore.mappers;

import com.example.bookstore.dto.BookDto;
import com.example.bookstore.models.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper (componentModel = "spring")
public interface BookMapper {

    @Mapping(source = "name", target = "title")
    Book toDto(Book book);

    @Mapping(source = "title", target = "name")
    BookDto toEntity(BookDto bookDto);
}
