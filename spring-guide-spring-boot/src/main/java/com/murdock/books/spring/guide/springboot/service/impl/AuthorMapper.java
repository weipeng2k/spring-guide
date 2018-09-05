package com.murdock.books.spring.guide.springboot.service.impl;

import com.murdock.books.spring.guide.springboot.dao.dataobject.AuthorDO;
import com.murdock.books.spring.guide.springboot.domain.AuthorModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

/**
 * @author weipeng2k 2018年08月25日 下午15:49:55
 */
@Mapper(componentModel = "spring")
@Component
public interface AuthorMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    AuthorModel convert(AuthorDO authorDO);
}
