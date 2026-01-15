package DesignPatterns.ObserverDesignPattern.PushModel.Observer;

import DesignPatterns.ObserverDesignPattern.PushModel.Stock;

public class EmailNotificationObserver implements Observer {

    @Override
    public void update(Stock stock) {
        if(stock.getQuantity() == 0){
            System.out.println("Notified via E-Mail: Out of stock !");
        }
        else{
            System.out.println("Notified via E-mail: Stock is back/updated: " + stock);
        }
    }
}
