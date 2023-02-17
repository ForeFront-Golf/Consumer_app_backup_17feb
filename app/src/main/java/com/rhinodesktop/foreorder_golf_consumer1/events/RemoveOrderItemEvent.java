package com.rhinodesktop.foreorder_golf_consumer1.events;

import com.rhinodesktop.foreorder_golf_consumer1.models.OrderItem;

import lombok.Getter;

/**
 * Created by rhinodesktop on 2017-03-29.
 */

public class RemoveOrderItemEvent {

    @Getter
    private OrderItem orderItemToRemove;

    public RemoveOrderItemEvent(OrderItem orderItemToRemove) {
        this.orderItemToRemove = orderItemToRemove;
    }
}
