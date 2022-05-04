package com.petersarazin.booksservicespringbootmybatismysql.service;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
}
