package com.MartaPrzybyl.Order;

import com.MartaPrzybyl.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {
    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObserves = new HashSet<Observer>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObserves.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObserves.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obser : registeredObserves) {
            obser.update(this);
        }
    }

    public void changeOrderStatus(OrderStatus orderStatus){
        setOrderStatus(orderStatus);
        notifyObservers();
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }


}
