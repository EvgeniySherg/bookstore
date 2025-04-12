package com.example.bookstore.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/// В BookDto мы определяем какие данные отдавать клиенту
/// в данном случае избавились от id, count, а также изменили поле name на title
@NoArgsConstructor
@Data
public class BookDto {
    private String title;
    private String author;
    private String publisher;
    private String coverType;
}
