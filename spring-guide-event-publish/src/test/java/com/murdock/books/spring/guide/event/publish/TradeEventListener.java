package com.murdock.books.spring.guide.event.publish;

import org.springframework.context.event.EventListener;

/**
 * <pre>
 * 监听器的入参符合里氏替换原则，也就是父类适合的地方，子类也适合，反之不成立
 *
 * 所以监听父类类型是子类型，对父类型和子类型的监听能够完成处理，子类很好理解，这是一样的类型，但是父类就需要用这个原则来描述，因为是父类，所以子类消息也能够处理
 *
 * 如果监听的类型是父类，发送的消息是父类，那父类处理器肯定执行，但是子类就不一定，因为子类并不一定适合
 *
 * 这个地方的可以简单的理解为，发送子类消息，父类处理器能够处理
 *
 * 这点也需要了解，消息的层级结构不宜太复杂
 * </pre>
 *
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


    @EventListener(condition = "#tradeMsg.eventType == T(com.murdock.books.spring.guide.event.publish.EventType).CREATE")
    public void createProcess(SubTradeMsg tradeMsg) {
        System.out.println("sub got create message, " + tradeMsg.getOrder().getOrderId());
    }
}
