package com.murdock.books.spring.guide.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author weipeng2k 2018年08月20日 下午16:03:27
 */
public class LogTest {

    @Test
    public void m() {
        Logger logger = LoggerFactory.getLogger(LogTest.class);
        String value = "xxxx";
        try {
            Double.parseDouble(value);
        } catch (Exception ex) {
            logger.error("got error with param {}, now", value, ex);
        }
    }

    @Test
    public void info() {
        Logger logger = LoggerFactory.getLogger(LogTest.class);
        logger.info("End process:{0},{1} wrong style", "x", "y");
        logger.info("End process:{},{} correct style", "x", "y");
    }

}
