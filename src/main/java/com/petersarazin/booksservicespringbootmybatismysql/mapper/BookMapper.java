package com.petersarazin.booksservicespringbootmybatismysql.mapper;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    List<Book> getBooks();

    Book getBookDetails(int bookId);
}
