package com.MartaPrzybyl;

import com.MartaPrzybyl.Order.Order;
import com.MartaPrzybyl.Order.OrderStatus;
import com.MartaPrzybyl.notification.Email;
import com.MartaPrzybyl.notification.MobileApp;
import com.MartaPrzybyl.notification.TextMessage;

public class Main {

    public static void main(String[] args) {


	Order order = new Order(101L,OrderStatus.ZAREJESTROWANO);

        TextMessage textMessage = new TextMessage();
        Email email = new Email();
        MobileApp mobileApp = new MobileApp();

        order.registerObserver(textMessage);
        order.registerObserver(email);
        order.registerObserver(mobileApp);

        order.notifyObservers();

        System.out.println("----------------------------------");
        order.changeOrderStatus(OrderStatus.WYSŁANO);

        order.unregisterObserver(textMessage);

        System.out.println("----------------------------------");

        order.changeOrderStatus(OrderStatus.ODEBRANO);
    }
}
