package com.murdock.books.spring.guide.event.publish;

import org.springframework.context.event.EventListener;

/**
 * @author weipeng2k 2019年03月26日 下午19:23:07
 */
public class TradeEventListener {

    @EventListener(condition = "#tradeMsg.eventType == T(com.murdock.books.spring.guide.event.publish.EventType).CREATE")
    public void createProcess(TradeMsg tradeMsg) {
        System.out.println("got create message, " + tradeMsg.getOrder().getOrderId());
    }

    @EventListener(condition = "#tradeMsg.eventType == T(com.murdock.books.spring.guide.event.publish.EventType).PAY")
    public void payProcess(TradeMsg tradeMsg) {
        System.out.println("got pay message, " + tradeMsg.getOrder().getOrderId());
    }


    @EventListener(condition = "#tradeMsg.eventType == T(com.murdock.books.spring.guide.event.publish.EventType).SEND_GOODS")
    public void sendGoodsProcess(TradeMsg tradeMsg) {
        System.out.println("got send goods message, " + tradeMsg.getOrder().getOrderId());
    }


    @EventListener(condition = "#tradeMsg.eventType == T(com.murdock.books.spring.guide.event.publish.EventType).RECEIVE_GOODS")
    public void receiveProcess(TradeMsg tradeMsg) {
        System.out.println("got receive message, " + tradeMsg.getOrder().getOrderId());
    }
}
