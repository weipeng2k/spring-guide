package com.murdock.books.spring.guide.event.publish;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author weipeng2k 2019年03月26日 下午19:21:10
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TradeEventPublishTest.Config.class)
public class TradeEventPublishTest {

    @Autowired
    private TradeEventPublish tradeEventPublish;

    @Test
    public void create() {

        tradeEventPublish.sendCreateTradeMessage(123L);
    }

    @Test
    public void receive_goods() {

        tradeEventPublish.sendReceiveGoodsTradeMessage(123L);
    }

    @Test
    public void create_sub() {
        tradeEventPublish.sendCreateSubTradeMessage(321L);
    }


    @Configuration
    static class Config {

        @Bean
        TradeEventPublish tradeEventPublish() {
            return new TradeEventPublish();
        }

        @Bean
        TradeEventListener tradeEventListener() {
            return new TradeEventListener();
        }
    }

}