package com.petersarazin.bookservice.mapper;

import com.petersarazin.bookservice.domain.BookTitle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookTitleMapper {

    @Select("select * from book_title")
    List<BookTitle> findAll();

    @Select("select * from book_title where title like #{titleLike}")
    List<BookTitle> findByTitleLike(String titleLike);
}
