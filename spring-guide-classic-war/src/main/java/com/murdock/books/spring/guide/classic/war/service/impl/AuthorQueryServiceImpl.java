package com.murdock.books.spring.guide.classic.war.service.impl;

import com.murdock.books.spring.guide.classic.war.dao.AuthorDAO;
import com.murdock.books.spring.guide.classic.war.domain.AuthorModel;
import com.murdock.books.spring.guide.classic.war.service.AuthorQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weipeng2k 2018年07月22日 下午18:10:37
 */
@Service("authorQueryService")
public class AuthorQueryServiceImpl implements AuthorQueryService {

    @Autowired
    private AuthorDAO authorDAO;

    @Override
    public AuthorModel queryAuthor(Long id) {
        AuthorModel result = authorDAO.queryAuthorById(id)
                .map(AuthorUtils::convert)
                .orElse(null);
        return result;
    }
}
