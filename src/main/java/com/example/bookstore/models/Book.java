package com.example.bookstore.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/// Почему то Getter и Setter не отрабатывают. Если не писать их самому то нельзя получить доступ к полям
@Entity
@NoArgsConstructor
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotEmpty (message = "Название книги не может быть пустым")
    @Column(name = "name", nullable = false)
    private String name;

    @NotEmpty (message = "Имя автора не может быть пустым")
    @Column(name = "author", nullable = false)
    private String author;

    @NotEmpty (message = "Наименование издателя не может быть пустым")
    @Column(name = "publisher", nullable = false)
    private String publisher; // brand


    @Column (name = "count", nullable = false)
    private Integer count;

    @Enumerated(EnumType.STRING)
    @Column(name = "cover", nullable = false)
    private Cover coverType;

//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public  String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public  String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher( String publisher) {
//        this.publisher = publisher;
//    }
//
//    public Integer getCount() {
//        return count;
//    }
//
//    public void setCount(Integer count) {
//        this.count = count;
//    }
//
//    public Cover getCoverType() {
//        return coverType;
//    }
//
//    public void setCoverType(Cover coverType) {
//        this.coverType = coverType;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", count=" + count +
//                ", coverType=" + coverType +
//                '}';
//    }
}
