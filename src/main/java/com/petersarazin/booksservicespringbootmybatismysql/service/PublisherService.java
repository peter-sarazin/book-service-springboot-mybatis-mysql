package com.petersarazin.booksservicespringbootmybatismysql.service;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Publisher;

import java.util.List;

public interface PublisherService {

    List<Publisher> findAll();
    int insertPublisher(Publisher publisher);

    int updatePublisher(Publisher publisher);
}
