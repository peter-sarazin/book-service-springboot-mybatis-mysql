package com.petersarazin.bookservice.service;

import com.petersarazin.bookservice.domain.Book;
import com.petersarazin.bookservice.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> searchBooks(Map bookSearchCriteriaMap) {
        return bookMapper.searchBooks(bookSearchCriteriaMap);
    }

    @Override
    public Book getBookDetails(int bookId) { return bookMapper.getBookDetails(bookId); }
}
