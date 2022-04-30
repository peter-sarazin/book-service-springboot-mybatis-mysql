package com.petersarazin.booksservicespringbootmybatismysql.mapper;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Publisher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PublisherMapper {

    @Select("select * from publisher")
    List<Publisher> findAll();

    @Insert("insert into publisher(publisher_name, url) values (#{publisherName}, #{url})")
    @Options(useGeneratedKeys = true, keyProperty = "publisherId")
    int insertPublisher(Publisher publisher);

    @Update("update publisher set publisher_name = #{publisherName}, url = #{url} where publisher_id = #{publisherId}")
    int updatePublisher(Publisher publisher);
}
