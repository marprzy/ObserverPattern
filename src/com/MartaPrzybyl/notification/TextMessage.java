package com.MartaPrzybyl.notification;

import com.MartaPrzybyl.Order.Order;

public class TextMessage implements Observer{

    public void update(Order order){
        System.out.println("SMS: Zamówienie numer " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
