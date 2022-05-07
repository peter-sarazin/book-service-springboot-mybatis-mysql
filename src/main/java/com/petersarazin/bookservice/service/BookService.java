package com.petersarazin.bookservice.service;

import com.petersarazin.bookservice.domain.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<Book> searchBooks(Map bookSearchCriteriaMap);

    Book getBookDetails(int bookId);
}
