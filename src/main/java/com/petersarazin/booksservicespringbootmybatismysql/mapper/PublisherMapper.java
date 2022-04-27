package com.petersarazin.booksservicespringbootmybatismysql.mapper;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Publisher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PublisherMapper {

    @Select("select * from publisher")
    List<Publisher> findAll();

    @Insert("insert into publisher(publisher_name, url) values (#{publisherName}, #{url})")
    @Options(useGeneratedKeys = true, keyProperty = "publisherId")
    int insertPublisher(Publisher publisher);
}
