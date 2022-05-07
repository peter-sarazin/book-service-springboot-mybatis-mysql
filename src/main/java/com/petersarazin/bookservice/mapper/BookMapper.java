package com.petersarazin.bookservice.mapper;

import com.petersarazin.bookservice.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {

    List<Book> searchBooks(Map bookSearchCriteriaMap);

    Book getBookDetails(int bookId);
}
