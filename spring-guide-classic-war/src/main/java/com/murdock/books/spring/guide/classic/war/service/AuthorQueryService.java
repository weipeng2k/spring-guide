package com.murdock.books.spring.guide.classic.war.service;

import com.murdock.books.spring.guide.classic.war.domain.AuthorModel;

/**
 * @author weipeng2k 2018年07月22日 下午17:03:19
 */
public interface AuthorQueryService {

    /**
     * Return Author by given id.
     * <p></p>
     * Not use Optional, because service may remote access.
     *
     * @param id pk
     * @return author
     */
    AuthorModel queryAuthor(Long id);

}
