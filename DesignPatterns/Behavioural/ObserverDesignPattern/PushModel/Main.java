package DesignPatterns.Behavioural.ObserverDesignPattern.PushModel;

import DesignPatterns.Behavioural.ObserverDesignPattern.PushModel.Observable.ShoesObservable;
import DesignPatterns.Behavioural.ObserverDesignPattern.PushModel.Observer.EmailNotificationObserver;
import DesignPatterns.Behavioural.ObserverDesignPattern.PushModel.Observer.TextNotificationObserver;

public class Main {
    public static void main(String[] args) {

        ShoesObservable shoesObservable = new ShoesObservable();
        EmailNotificationObserver emailNotificationObserver = new EmailNotificationObserver();
        TextNotificationObserver textNotificationObserver = new TextNotificationObserver();

        shoesObservable.register(emailNotificationObserver);
        shoesObservable.register(textNotificationObserver);

        shoesObservable.doNotify();   // Will notify
        shoesObservable.updateStock(32, 100); // Will notify since before refilling, the stock is empty
        shoesObservable.updateStock(20, 200); // Will not notify since before refilling, the stock is not empty
        shoesObservable.doNotify();   // Will notify
        shoesObservable.clearStock();
        shoesObservable.updateStock(53, 50);  // Will notify since before refilling, the stock is empty
    }
}
