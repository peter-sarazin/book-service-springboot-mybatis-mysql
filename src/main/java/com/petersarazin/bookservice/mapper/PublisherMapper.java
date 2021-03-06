package com.petersarazin.bookservice.mapper;

import com.petersarazin.bookservice.domain.Publisher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PublisherMapper {

    @Select("select * from publisher")
    List<Publisher> findAll();

    @Select("select * from publisher where publisher_id = #{publisherId}")
    Publisher findById(int publisherId);

    @Insert("insert into publisher(publisher_name, url) values (#{publisherName}, #{url})")
    @Options(useGeneratedKeys = true, keyProperty = "publisherId")
    int insertPublisher(Publisher publisher);

    @Update("update publisher set publisher_name = #{publisherName}, url = #{url} where publisher_id = #{publisherId}")
    int updatePublisher(Publisher publisher);
}
