package com.petersarazin.booksservicespringbootmybatismysql.service;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Publisher;
import com.petersarazin.booksservicespringbootmybatismysql.mapper.PublisherMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {

    private PublisherMapper publisherMapper;

    public PublisherServiceImpl(PublisherMapper publisherMapper) {
        this.publisherMapper = publisherMapper;
    }

    @Override
    public List<Publisher> findAll() {
        return publisherMapper.findAll();
    }

    @Override
    public int insertPublisher(Publisher publisher) {
        int numberOfRows = publisherMapper.insertPublisher(publisher);
        return numberOfRows;
    }
}
