package com.MartaPrzybyl.notification;

import com.MartaPrzybyl.Order.Order;

public class Email implements Observer {
    public void update(Order order){
        System.out.println("MAIL: Zamówienie numer " + order.getOrderNumber()
                + " zmieniło status na: " + order.getOrderStatus());
    }
}
