package com.example.bookstore.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity
@RequiredArgsConstructor
@NoArgsConstructor// create  getters, setters, hashcode, toString and Constructor with args
@Table(name = "book")
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

    @NotNull (message = "колличество книг не может быть null")
    @Column (name = "count", nullable = false)
    private Integer count;

    @Enumerated(EnumType.STRING)
    @Column(name = "cover", nullable = false)
    private Cover coverType;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotEmpty(message = "Название книги не может быть пустым") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "Название книги не может быть пустым") String name) {
        this.name = name;
    }

    public @NotEmpty(message = "Имя автора не может быть пустым") String getAuthor() {
        return author;
    }

    public void setAuthor(@NotEmpty(message = "Имя автора не может быть пустым") String author) {
        this.author = author;
    }

    public @NotEmpty(message = "Наименование издателя не может быть пустым") String getPublisher() {
        return publisher;
    }

    public void setPublisher(@NotEmpty(message = "Наименование издателя не может быть пустым") String publisher) {
        this.publisher = publisher;
    }

    public @NotNull(message = "колличество книг не может быть null") Integer getCount() {
        return count;
    }

    public void setCount(@NotNull(message = "колличество книг не может быть null") Integer count) {
        this.count = count;
    }

    public Cover getCoverType() {
        return coverType;
    }

    public void setCoverType(Cover coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", count=" + count +
                ", coverType=" + coverType +
                '}';
    }
}
