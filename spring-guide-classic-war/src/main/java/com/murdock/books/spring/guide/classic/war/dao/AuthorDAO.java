package com.murdock.books.spring.guide.classic.war.dao;

import com.murdock.books.spring.guide.classic.war.dao.dataobject.AuthorDO;

import java.util.Optional;

/**
 * @author weipeng2k 2018年07月22日 下午14:29:31
 */
public interface AuthorDAO {

    Optional<AuthorDO> queryAuthorById(Long id);
}
