package com.petersarazin.booksservicespringbootmybatismysql.mapper;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Book;
import com.petersarazin.booksservicespringbootmybatismysql.domain.BookSearchCriteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {

    List<Book> searchBooks(Map bookSearchCriteriaMap);

    Book getBookDetails(int bookId);
}
