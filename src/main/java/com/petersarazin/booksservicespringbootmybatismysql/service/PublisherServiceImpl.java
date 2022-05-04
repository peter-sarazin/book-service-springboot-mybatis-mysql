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
    public Publisher findById(int publisherId) {
        return publisherMapper.findById(publisherId);
    }

    @Override
    public int insertPublisher(Publisher publisher) {
        return publisherMapper.insertPublisher(publisher);
      }

    @Override
    public int updatePublisher(Publisher publisher) {
        int numberOfRows = 0;

        try {
            numberOfRows = publisherMapper.updatePublisher(publisher);
        }
        catch( RuntimeException re ) {
            String message = re.getClass().getSimpleName() + " caught in updatedPublisher(): " + re.getMessage();
            System.err.println(message);
            throw re;
        }

        return numberOfRows;
    }

}
