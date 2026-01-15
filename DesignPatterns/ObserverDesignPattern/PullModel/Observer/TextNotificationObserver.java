package DesignPatterns.ObserverDesignPattern.PullModel.Observer;

import DesignPatterns.ObserverDesignPattern.PullModel.Observable.Observable;

public class TextNotificationObserver implements Observer{

    public Observable observable;

    public TextNotificationObserver(Observable observable){
        this.observable = observable;
    }

    @Override
    public void update() {
        if(observable.getStock() == 0){
            System.out.println("Notified via Text: Out of stock !");
        }
        else{
            System.out.println("Notified via Text: Stock is back.");
        }
    }
}
