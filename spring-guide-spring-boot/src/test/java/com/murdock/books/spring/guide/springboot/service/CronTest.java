package com.murdock.books.spring.guide.springboot.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author weipeng2k 2018年08月25日 下午15:56:37
 */
@SpringBootTest(classes = CronTest.Config.class)
@RunWith(SpringRunner.class)
public class CronTest {

    @Test
    public void date() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date time = calendar.getTime();

        DateFormat simpleDateFormat = new SimpleDateFormat("d0001");
        String format = simpleDateFormat.format(time);
        System.out.println(time);
        System.out.println(format);
    }

    @Test
    public void now() {
        DateFormat simpleDateFormat = new SimpleDateFormat("d0001");
        String format = simpleDateFormat.format(new Date());
        System.out.println(new Date());
        System.out.println(format);
    }

    @Test
    public void calendar() {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);

        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        System.out.println(hours);
        System.out.println(minute);
    }

    @Test
    public void c() {
        Calendar calendar = Calendar.getInstance();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        System.out.println(hours);
        System.out.println(minute);
    }

    @Test
    public void calendar_ju() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 70);
        Date time = calendar.getTime();

        System.out.println(time);

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(time);

        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        System.out.println(hours);
        System.out.println(minute);
    }

    @Test
    public void test() throws Exception {
        Thread.sleep(1000 * 60);
    }


    @Configuration
    @EnableScheduling
    @EnableAsync
    static class Config {

        @Bean
        TS ts() {
            return new TS();
        }

        @Bean
        TS ts1() {
            return new TS();
        }
    }


    static class TS {
        @Scheduled(cron = "0/5 * * * * ?")
        void print() throws InterruptedException {
            System.out.println(Thread.currentThread().toString()+ "@" + new Date());
        }
    }
}