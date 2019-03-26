package com.murdock.books.spring.guide.event.publish;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author weipeng2k 2019年03月26日 下午19:14:19
 */
public class TradeEventPublish implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    /**
     * 发送创建事件
     */
    public void sendCreateTradeMessage(Long orderId) {

        Order order = new Order();
        order.setOrderId(orderId);
        TradeMsg tradeMsg = new TradeMsg();
        tradeMsg.setOrder(order);
        tradeMsg.setEventType(EventType.CREATE);

        applicationContext.publishEvent(tradeMsg);
    }

    /**
     * 发送支付事件
     */
    public void sendPayTradeMessage(Long orderId) {

        Order order = new Order();
        order.setOrderId(orderId);
        TradeMsg tradeMsg = new TradeMsg();
        tradeMsg.setOrder(order);
        tradeMsg.setEventType(EventType.PAY);

        applicationContext.publishEvent(tradeMsg);
    }

    /**
     * 发送发货事件
     */
    public void sendSendGoodsTradeMessage(Long orderId) {

        Order order = new Order();
        order.setOrderId(orderId);
        TradeMsg tradeMsg = new TradeMsg();
        tradeMsg.setOrder(order);
        tradeMsg.setEventType(EventType.SEND_GOODS);

        applicationContext.publishEvent(tradeMsg);
    }

    /**
     * 发送确认收货事件
     */
    public void sendReceiveGoodsTradeMessage(Long orderId) {

        Order order = new Order();
        order.setOrderId(orderId);
        TradeMsg tradeMsg = new TradeMsg();
        tradeMsg.setOrder(order);
        tradeMsg.setEventType(EventType.RECEIVE_GOODS);

        applicationContext.publishEvent(tradeMsg);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
