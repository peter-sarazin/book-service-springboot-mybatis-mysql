package com.petersarazin.booksservicespringbootmybatismysql.mapper;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Publisher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PublisherMapper {

    @Select("select * from publisher")
    List<Publisher> findAll();
}
