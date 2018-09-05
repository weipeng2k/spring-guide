package com.murdock.books.spring.guide.springboot.web;


import com.murdock.books.spring.guide.springboot.domain.AuthorModel;
import com.murdock.books.spring.guide.springboot.service.AuthorQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weipeng2k 2018年07月22日 下午19:04:55
 */
@RestController
@RequestMapping("/api")
public class AuthorApi {

    @Autowired
    private AuthorQueryService authorQueryService;

    @RequestMapping(method = RequestMethod.GET, value = "/author/{authorId}", produces = "application/json")
    public AuthorModel queryById(@PathVariable("authorId") Long authorId) {
        return authorQueryService.queryAuthor(authorId);
    }
}
