package com.MartaPrzybyl.Order;

import com.MartaPrzybyl.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
