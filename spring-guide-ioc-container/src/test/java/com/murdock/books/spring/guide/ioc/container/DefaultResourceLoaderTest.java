package com.murdock.books.spring.guide.ioc.container;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * @author weipeng2k 2018年09月24日 下午17:22:58
 */
public class DefaultResourceLoaderTest {

    ResourceLoader resourceLoader = new DefaultResourceLoader();

    @Test
    public void get_file() {
        Resource resource = resourceLoader.getResource(
                "file:/Users/weipeng2k/Documents/workspace/spring-guide/spring-guide-ioc-container/src/test/resources/conf/file1.txt");
        Assert.assertTrue(resource.exists());
    }

    @Test
    public void get_relative_file() {
        Resource resource = resourceLoader.getResource("/conf/file1.txt");
        Assert.assertTrue(resource.exists());
    }

    @Test
    public void get_class_path() {
        Resource resource = resourceLoader.getResource("classpath:conf/file1.txt");
        Assert.assertTrue(resource.exists());
    }

    @Test
    public void get_ant_style() {
        Resource resource = resourceLoader.getResource("classpath:conf/*.txt");
        Assert.assertFalse(resource.exists());
    }
}
