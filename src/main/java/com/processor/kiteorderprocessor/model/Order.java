package com.processor.kiteorderprocessor.model;

import java.util.Optional;

public class Order {
    
    private String orderId;
    private String orderStatus;
    private String orderPrice;
    private String orderType;
    private String transactionType;
    private String tradingsymbol;
    private Optional<String> triggerPrice;
    private Optional<String> strategyName;
    private Optional<String> tag;

    public Order() {		
	}

    public Order(String orderId, String orderStatus, String orderPrice, String orderType, String transactionType, String tradingsymbol, Optional<String> triggerPrice, Optional<String> strategyName, Optional<String> tag) {
        super();
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.orderPrice = orderPrice;
        this.orderType = orderType;
        this.transactionType = transactionType;
        this.tradingsymbol = tradingsymbol;
        this.strategyName = strategyName;
        this.triggerPrice = triggerPrice;
        this.tag = tag;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public String getOrderType() {
        return orderType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getTradingsymbol() {
        return tradingsymbol;
    }

    public Optional<String> getStrategyName() {
        return strategyName;
    }

    public Optional<String> getTag() {
        return tag;
    }

    public Optional<String> getTriggerPrice() {
        return triggerPrice;
    }


}


