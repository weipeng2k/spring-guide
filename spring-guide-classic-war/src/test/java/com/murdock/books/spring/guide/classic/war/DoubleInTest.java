package com.murdock.books.spring.guide.classic.war;

import org.junit.Test;

/**
 * @author weipeng2k 2018年08月20日 上午11:18:16
 */
public class DoubleInTest {

    @Test
    public void test() {
        long i = 222222;
        double d = 0.99;
        System.out.println(i * d);
        System.out.println((long) (i * d));
        System.out.println(Math.round(i * d));
    }

    @Test
    public void round() {
        System.out.println(Math.round(4.45));
        System.out.println(Math.round(4.44));
        System.out.println(Math.round(4.4));
        System.out.println(Math.round(4.5));
    }

    @Test
    public void print_double() {
        System.out.println(0.00000001);
    }
}
