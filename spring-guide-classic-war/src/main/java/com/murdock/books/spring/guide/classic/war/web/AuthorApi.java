package com.murdock.books.spring.guide.classic.war.web;

import com.alibaba.fastjson.JSON;

import com.murdock.books.spring.guide.classic.war.service.AuthorQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author weipeng2k 2018年07月22日 下午19:04:55
 */
@Controller
@RequestMapping("/api")
public class AuthorApi {

    @Autowired
    private AuthorQueryService authorQueryService;

    @RequestMapping(method = RequestMethod.GET, value = "/author.do", produces = "application/json")
    @ResponseBody
    public String queryById(@RequestParam("id") Long id) {
        return JSON.toJSONString(authorQueryService.queryAuthor(id));
    }
}
