package com.petersarazin.booksservicespringbootmybatismysql.service;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Publisher;

import java.util.List;

public interface PublisherService {

    List<Publisher> findAll();
}
