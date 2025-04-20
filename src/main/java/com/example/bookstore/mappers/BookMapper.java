package com.example.bookstore.mappers;

import com.example.bookstore.dto.BookDto;
import com.example.bookstore.models.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {




    BookDto toDto(Book book);


    Book toEntity(BookDto bookDto);
}
