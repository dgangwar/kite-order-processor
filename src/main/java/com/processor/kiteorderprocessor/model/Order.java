package com.processor.kiteorderprocessor.model;

public class Order {
    
    private String orderId;
    private String strategyName;

    public Order() {		
	}

    public Order(String orderId, String strategyName) {
        super();
        this.orderId = orderId;
        this.strategyName = strategyName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId =  orderId;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

}
