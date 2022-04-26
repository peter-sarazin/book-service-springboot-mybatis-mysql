package com.petersarazin.booksservicespringbootmybatismysql.restcontroller;

import com.petersarazin.booksservicespringbootmybatismysql.domain.BookTitle;
import com.petersarazin.booksservicespringbootmybatismysql.domain.Publisher;
import com.petersarazin.booksservicespringbootmybatismysql.service.PublisherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/publisher")
public class PublisherRestController {

    private PublisherService publisherService;

    public PublisherRestController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping
    ResponseEntity<?> getAllPublishers() {
        ResponseEntity<?> responseEntity = null;
        List<Publisher> publisherList = publisherService.findAll();

        if( publisherList.isEmpty() ) {
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            responseEntity = new ResponseEntity<List<Publisher>>(publisherList, HttpStatus.OK);
        }

        return responseEntity;
    }
}
