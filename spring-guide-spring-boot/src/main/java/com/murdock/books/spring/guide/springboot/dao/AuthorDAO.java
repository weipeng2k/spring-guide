package com.murdock.books.spring.guide.springboot.dao;

import com.murdock.books.spring.guide.springboot.dao.dataobject.AuthorDO;

import java.util.Optional;

/**
 * @author weipeng2k 2018年08月25日 下午15:12:44
 */
public interface AuthorDAO {

    Optional<AuthorDO> queryAuthorById(Long id);
}
