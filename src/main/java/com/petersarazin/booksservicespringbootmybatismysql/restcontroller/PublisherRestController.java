package com.petersarazin.booksservicespringbootmybatismysql.restcontroller;

import com.petersarazin.booksservicespringbootmybatismysql.domain.BookTitle;
import com.petersarazin.booksservicespringbootmybatismysql.domain.Publisher;
import com.petersarazin.booksservicespringbootmybatismysql.service.PublisherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping( "/{publisherId}")
    ResponseEntity<?> getPublisherById(@PathVariable Integer publisherId) {
        ResponseEntity<?> responseEntity = null;
        Publisher publisher = publisherService.findById(publisherId);

        if( publisher == null ) {
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            responseEntity = new ResponseEntity<Publisher>(publisher, HttpStatus.OK);
        }

        return responseEntity;
    }

    @PostMapping
    ResponseEntity<?> createPublisher(@RequestBody Publisher publisher) {
        ResponseEntity<?> responseEntity = null;
        int numberOfRows = publisherService.insertPublisher(publisher);

        if(numberOfRows == 1) {
            responseEntity = new ResponseEntity<>(publisher,HttpStatus.CREATED);
        }
        else {
            responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;
    }

    @PutMapping
    ResponseEntity<?> updatePublisher(@RequestBody Publisher publisher) {
        ResponseEntity<?> responseEntity = null;
        int numberOfRows = 0;

        try {
            numberOfRows = publisherService.updatePublisher(publisher);

            if (numberOfRows == 0) {
                responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                responseEntity = new ResponseEntity<>(publisher, HttpStatus.OK);
            }
        }
        catch( RuntimeException re) {
            String message = re.getClass().getSimpleName() + " caught in updatePublisher(): " + re.getMessage();
            System.err.println(message);
            responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;
    }
}
