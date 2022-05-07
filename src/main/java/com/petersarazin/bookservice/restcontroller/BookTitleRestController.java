package com.petersarazin.bookservice.restcontroller;

import com.petersarazin.bookservice.domain.BookTitle;
import com.petersarazin.bookservice.service.BookTitleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book-title")
public class BookTitleRestController {

    private BookTitleService bookTitleService;

    public BookTitleRestController(BookTitleService bookTitleService) {
        this.bookTitleService = bookTitleService;
    }

    @GetMapping
    public ResponseEntity<?> getAllBookTitles() {
        ResponseEntity<?> responseEntity = null;
        List<BookTitle> bookTitleList = bookTitleService.findAll();

        if( bookTitleList.isEmpty() ) {
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            responseEntity = new ResponseEntity<List<BookTitle>>(bookTitleList, HttpStatus.OK);
        }

        return responseEntity;
    }

    @GetMapping("/title/like/{titleLike}")
    public ResponseEntity<?> getBookTitleLike(@PathVariable String titleLike) {
        ResponseEntity<?> responseEntity = null;
        List<BookTitle> bookTitleList = bookTitleService.findBookTitleByTitleLike(titleLike);

        if( bookTitleList.isEmpty() ) {
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            responseEntity = new ResponseEntity<List<BookTitle>>(bookTitleList, HttpStatus.OK);
        }

        return responseEntity;
    }
}
