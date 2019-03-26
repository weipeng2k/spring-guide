package com.murdock.books.spring.guide.event.publish;

/**
 * @author weipeng2k 2019年03月26日 下午19:11:44
 */
public class TradeMsg {

    private Order order;

    private EventType eventType;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
