package com.petersarazin.booksservicespringbootmybatismysql.restcontroller;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Book;
import com.petersarazin.booksservicespringbootmybatismysql.domain.BookSearchCriteria;
import com.petersarazin.booksservicespringbootmybatismysql.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookRestController {

    private BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    ResponseEntity<?> getBooks() {
        ResponseEntity<?> responseEntity = null;

        List<Book> bookList = bookService.getBooks();

        if( bookList.isEmpty() ) {
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            responseEntity = new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
        }


        return responseEntity;
    }

    @PostMapping
    ResponseEntity<?> searchBooks(@RequestBody BookSearchCriteria bookSearchCriteria ) {
        ResponseEntity<?> responseEntity;
        List<Book> bookList = bookService.getBooks();

        if( bookList.isEmpty() ) {
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            responseEntity = new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
        }

        return responseEntity;
    }
}
