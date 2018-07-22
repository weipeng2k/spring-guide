package com.murdock.books.spring.guide.classic.war.dao;

import com.murdock.books.spring.guide.classic.war.dao.dataobject.AuthorDO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author weipeng2k 2018年07月22日 下午14:54:04
 */
@ContextConfiguration(locations = {"classpath:dao.xml", "classpath:datasource.xml"})
public class AuthorDAOTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private AuthorDAO authorDAO;

    @Test
    public void query_by_id() {
        AuthorDO authorDO = authorDAO.queryAuthorById(1L).get();
        Assert.assertNotNull(authorDO);
    }

    @Test
    public void query_by_max() {
        Assert.assertFalse(authorDAO.queryAuthorById(Long.MAX_VALUE).isPresent());
    }
}