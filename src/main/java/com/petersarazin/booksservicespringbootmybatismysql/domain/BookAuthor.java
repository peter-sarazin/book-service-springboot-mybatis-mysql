package com.petersarazin.booksservicespringbootmybatismysql.domain;

public class BookAuthor {
    private Integer bookId;
    private Person person;

    public Integer getBookId() { return bookId; }
    public void setBookId(Integer bookId) { this.bookId = bookId; }

    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }
}
