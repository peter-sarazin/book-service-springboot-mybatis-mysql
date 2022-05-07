package com.petersarazin.booksservicespringbootmybatismysql.service;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Book;
import com.petersarazin.booksservicespringbootmybatismysql.domain.BookSearchCriteria;
import com.petersarazin.booksservicespringbootmybatismysql.mapper.BookMapper;
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
