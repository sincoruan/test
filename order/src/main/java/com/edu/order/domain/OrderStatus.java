package com.edu.order.domain;

import lombok.Getter;

@Getter
public enum OrderStatus {
    PAID("PAID"),
    SHIPPED("SHIPPED"),
    CANCEL("CANCEL");

    private final String orderStatusName;

    private OrderStatus(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }
}
