package com.petersarazin.booksservicespringbootmybatismysql.restcontroller;

import com.petersarazin.booksservicespringbootmybatismysql.domain.Book;
import com.petersarazin.booksservicespringbootmybatismysql.domain.BookSearchCriteria;
import com.petersarazin.booksservicespringbootmybatismysql.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookRestController {

    private BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{bookId}")
    ResponseEntity<?> getBookDetails(@PathVariable Integer bookId) {
        ResponseEntity<?> responseEntity = null;

        Book book = bookService.getBookDetails(bookId);

        if( book == null ) {
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            responseEntity = new ResponseEntity<Book>(book, HttpStatus.OK);
        }

        return responseEntity;
    }

    @GetMapping
    ResponseEntity<?> searchBooks(@RequestParam Optional<String> title) {
        ResponseEntity<?> responseEntity = null;

        Map bookSearchCriteriaMap = new HashMap();

        if( title.isPresent() && title.get().trim().length() > 1)
        bookSearchCriteriaMap.put( "title", "%" + title.get().trim() + "%");
        List<Book> bookList = bookService.searchBooks(bookSearchCriteriaMap);

        if( bookList.isEmpty() ) {
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            responseEntity = new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
        }

        return responseEntity;
    }
}
