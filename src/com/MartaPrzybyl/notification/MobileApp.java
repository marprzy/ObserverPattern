package com.MartaPrzybyl.notification;

import com.MartaPrzybyl.Order.Order;

public class MobileApp implements Observer {
    public void update(Order order){
        System.out.println("Aplikacja Mobilna: Zamówienie numer " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
