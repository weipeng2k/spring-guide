package com.murdock.books.spring.guide.classic.war.service.impl;

import com.murdock.books.spring.guide.classic.war.dao.dataobject.AuthorDO;
import com.murdock.books.spring.guide.classic.war.domain.AuthorModel;

/**
 * @author weipeng2k 2018年07月22日 下午18:15:05
 */
public class AuthorUtils {

    public static AuthorModel convert(AuthorDO authorDO) {
        AuthorModel result = null;
        if (authorDO != null) {
            result = new AuthorModel();
            result.setId(authorDO.getId());
            result.setGmtCreate(authorDO.getGmtCreate());
            result.setGmtModified(authorDO.getGmtModified());
            result.setName(authorDO.getName());
            result.setRate(authorDO.getRate());
        }

        return result;
    }
}
