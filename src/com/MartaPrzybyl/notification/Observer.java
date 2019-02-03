package com.MartaPrzybyl.notification;

import com.MartaPrzybyl.Order.Order;

public interface Observer {
    void update(Order order);
}
