package DesignPatterns.ObserverDesignPattern.PushModel.Observer;

import DesignPatterns.ObserverDesignPattern.PushModel.Stock;

public class TextNotificationObserver implements Observer {

    @Override
    public void update(Stock stock) {
        if(stock.getQuantity() == 0){
            System.out.println("Notified via Text: Out of stock !");
        }
        else{
            System.out.println("Notified via Text: Stock is back: " + stock);
        }
    }
}
