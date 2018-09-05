package com.murdock.books.spring.guide.springboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author weipeng2k 2018年08月25日 下午15:25:59
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AuthorDAOTest {

    @Autowired
    private AuthorDAO authorDAO;

    @Test
    public void create() {
        assertNotNull(authorDAO);
    }

    @Test
    public void get_id() {
        System.out.println(authorDAO.queryAuthorById(1L));
    }
}