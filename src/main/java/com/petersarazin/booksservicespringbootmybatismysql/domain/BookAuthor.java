package com.petersarazin.booksservicespringbootmybatismysql.domain;

public class BookAuthor {
    private Integer bookId;
    private Integer personId;

    public Integer getBookId() { return bookId; }
    public void setBookId(Integer bookId) { this.bookId = bookId; }

    public Integer getPersonId() { return personId; }
    public void setPersonId(Integer personId) { this.personId = personId; }
}
