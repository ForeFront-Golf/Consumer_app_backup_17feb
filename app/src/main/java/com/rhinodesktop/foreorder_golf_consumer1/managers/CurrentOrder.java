package com.rhinodesktop.foreorder_golf_consumer1.managers;

import com.rhinodesktop.foreorder_golf_consumer1.models.Order;

import io.realm.annotations.Ignore;
import lombok.Getter;

/**
 * Created by rhinodesktop on 2017-03-07.
 */

public class CurrentOrder {

    @Ignore
    private static CurrentOrder currentOrder = null;

    public static CurrentOrder getInstance() {
        if (currentOrder == null) {
            currentOrder = new CurrentOrder();
        }
        return currentOrder;
    }

    @Ignore
    @Getter
    private Order order = new Order();



    public void setOrder(Order order) {
        this.order = order;
    }
}
