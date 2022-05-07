package com.petersarazin.bookservice.service;

import com.petersarazin.bookservice.domain.BookTitle;

import java.util.List;

public interface BookTitleService {

    /**
     * find all book titles.
     *
     * @return List<BookTitle>
     */
    List<BookTitle> findAll();

    /**
     * search for book titles using partial name.
     *
     * @param titleLike  partial book title to search on.
     * @return List<BookTitle>
     */
    List<BookTitle> findBookTitleByTitleLike( String titleLike);
}
