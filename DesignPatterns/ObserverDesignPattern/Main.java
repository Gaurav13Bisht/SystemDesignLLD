package DesignPatterns.ObserverDesignPattern;

import DesignPatterns.ObserverDesignPattern.Observable.ShoesObservable;
import DesignPatterns.ObserverDesignPattern.Observer.EmailNotificationObserver;
import DesignPatterns.ObserverDesignPattern.Observer.TextNotificationObserver;

public class Main {
    public static void main(String[] args) {

        ShoesObservable shoesObservable = new ShoesObservable();
        EmailNotificationObserver emailNotificationObserver = new EmailNotificationObserver(shoesObservable);
        TextNotificationObserver textNotificationObserver = new TextNotificationObserver(shoesObservable);

        shoesObservable.register(emailNotificationObserver);
        shoesObservable.register(textNotificationObserver);

        shoesObservable.doNotify();   // Will notify
        shoesObservable.refillStock(32); // Will notify since before refilling, the stock is empty
        shoesObservable.refillStock(20); // Will not notify since before refilling, the stock is not empty
        shoesObservable.doNotify();   // Will notify
        shoesObservable.clearStock();
        shoesObservable.refillStock(53);  // Will notify since before refilling, the stock is empty
    }
}
