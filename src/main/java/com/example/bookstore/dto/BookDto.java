package com.example.bookstore.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/// В BookDto мы определяем какие данные отдавать клиенту
/// в данном случае избавились от id, count, а также изменили поле name на title
@NoArgsConstructor
@Data

public class BookDto {
    private String name;
    private String author;
    private String publisher;
    private Integer count;
    private String coverType;
    private Long id;
//
//    public Integer getCount() {
//        return count;
//    }
//
//    public void setCount(Integer count) {
//        this.count = count;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }


}
