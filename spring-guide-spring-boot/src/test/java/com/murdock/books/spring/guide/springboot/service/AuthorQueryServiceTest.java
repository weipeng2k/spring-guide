package com.murdock.books.spring.guide.springboot.service;

import com.murdock.books.spring.guide.springboot.domain.AuthorModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author weipeng2k 2018年08月25日 下午15:56:37
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AuthorQueryServiceTest {

    @Autowired
    private AuthorQueryService authorQueryService;

    @Test
    public void create() {
        assertNotNull(authorQueryService);
    }

    @Test
    public void get_by_id() {
        AuthorModel authorModel = authorQueryService.queryAuthor(1L);
        assertEquals(1, authorModel.getId().intValue());
        assertEquals("weipeng", authorModel.getName());
        System.out.println(authorModel);
    }
}