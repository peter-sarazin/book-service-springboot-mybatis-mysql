package com.petersarazin.booksservicespringbootmybatismysql.domain;

public class BookSearchCriteria {

    private String title;
    private Integer edition;
    private String author;
    private String publisher;
    private String series;
    private String isbn10;
    private String isbn13;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Integer getEdition() { return edition; }
    public void setEdition(Integer edition) { this.edition = edition; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public String getSeries() { return series; }
    public void setSeries(String series) { this.series = series; }

    public String getIsbn10() { return isbn10; }
    public void setIsbn10(String isbn10) { this.isbn10 = isbn10; }

    public String getIsbn13() { return isbn13; }
    public void setIsbn13(String isbn13) { this.isbn13 = isbn13; }
}
