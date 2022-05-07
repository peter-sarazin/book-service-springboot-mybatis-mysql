package com.petersarazin.booksservicespringbootmybatismysql.service;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Book;
import com.petersarazin.booksservicespringbootmybatismysql.domain.BookSearchCriteria;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<Book> searchBooks(Map bookSearchCriteriaMap);

    Book getBookDetails(int bookId);
}
