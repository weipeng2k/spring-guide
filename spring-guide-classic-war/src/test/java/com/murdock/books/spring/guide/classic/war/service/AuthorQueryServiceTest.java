package com.murdock.books.spring.guide.classic.war.service;

import com.murdock.books.spring.guide.classic.war.domain.AuthorModel;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author weipeng2k 2018年07月22日 下午18:55:01
 */
@ContextConfiguration(locations = {"classpath:datasource.xml", "classpath:dao.xml", "classpath:service.xml"})
public class AuthorQueryServiceTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private AuthorQueryService authorQueryService;

    @Test
    public void query_author() {
        AuthorModel authorModel = authorQueryService.queryAuthor(1L);
        Assert.assertNotNull(authorModel);
    }

    @Test
    public void query_not_found() {
        AuthorModel authorModel = authorQueryService.queryAuthor(-1L);
        Assert.assertNull(authorModel);
    }
}