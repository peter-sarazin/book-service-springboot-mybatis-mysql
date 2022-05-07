package com.petersarazin.bookservice.service;

import com.petersarazin.bookservice.domain.Publisher;

import java.util.List;

public interface PublisherService {

    List<Publisher> findAll();

    Publisher findById(int publisherId);

    int insertPublisher(Publisher publisher);

    int updatePublisher(Publisher publisher);
}
