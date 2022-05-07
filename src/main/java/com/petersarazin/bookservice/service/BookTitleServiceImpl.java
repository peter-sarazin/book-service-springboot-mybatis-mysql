package com.petersarazin.bookservice.service;

import com.petersarazin.bookservice.domain.BookTitle;
import com.petersarazin.bookservice.mapper.BookTitleMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookTitleServiceImpl implements BookTitleService {

    private BookTitleMapper bookTitleMapper;

    public BookTitleServiceImpl(BookTitleMapper bookTitleMapper) {
        this.bookTitleMapper = bookTitleMapper;
    }

    @Override
    public List<BookTitle> findAll() {
        return bookTitleMapper.findAll();
    }

    @Override
    public List<BookTitle> findBookTitleByTitleLike(String titleLike) {
        return bookTitleMapper.findByTitleLike('%' + titleLike + '%');
    }
}
