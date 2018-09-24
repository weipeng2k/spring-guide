package com.murdock.books.spring.guide.ioc.container;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.util.Arrays;

/**
 * @author weipeng2k 2018年09月24日 下午17:35:02
 */
public class ResourcePatternResolverTest {

    ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();

    @Test
    public void get_file() throws Exception {
        Resource[] resources = resourcePatternResolver.getResources("/conf/*.txt");
        Arrays.stream(resources)
                .forEach(System.out::println);
        Assert.assertTrue(Arrays.stream(resources)
                .findAny()
                .isPresent());
    }

    @Test
    public void get_class_path() throws Exception {
        Resource[] resources = resourcePatternResolver.getResources("classpath:conf/fi?e1.txt");
        Arrays.stream(resources)
                .forEach(System.out::println);
        Assert.assertTrue(Arrays.stream(resources)
                .findAny()
                .isPresent());
    }

    @Test
    public void get_class_path2() throws Exception {
        Resource[] resources = resourcePatternResolver.getResources("classpath:**/*.txt");
        Arrays.stream(resources)
                .forEach(System.out::println);
        Assert.assertTrue(Arrays.stream(resources)
                .findAny()
                .isPresent());
    }

}
