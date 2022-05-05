package com.petersarazin.booksservicespringbootmybatismysql.domain;

import java.util.List;

public class Book {
    private Integer bookId;
    private BookTitle bookTitle;
    private Publisher publisher;
    private Series series;
    private Integer edition;
    private String isbn10;
    private String isbn13;
    private String url;
    private List<BookAuthor> bookAuthors;

    public Integer getBookId() {return bookId;}
    public void setBookId(Integer bookId) {this.bookId = bookId;}

    public BookTitle getBookTitle() {return bookTitle;}
    public void setBookTitle(BookTitle bookTitle) {this.bookTitle = bookTitle;}

    public Publisher getPublisher() {return publisher;}
    public void setPublisher(Publisher publisher) {this.publisher = publisher;}

    public Series getSeries() {return series;}
    public void setSeries(Series series) {this.series = series;}

    public Integer getEdition() {return edition;}
    public void setEdition(Integer edition) {this.edition = edition;}

    public String getIsbn10() {return isbn10;}
    public void setIsbn10(String isbn10) {this.isbn10 = isbn10;}

    public String getIsbn13() {return isbn13;}
    public void setIsbn13(String isbn13) {this.isbn13 = isbn13;}

    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}

    public List<BookAuthor> getBookAuthors() { return bookAuthors; }
    public void setBookAuthors(List<BookAuthor> bookAuthors) { this.bookAuthors = bookAuthors; }
}
