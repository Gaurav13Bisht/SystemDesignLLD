package DesignPatterns.ObserverDesignPattern.PullModel.Observable;

import DesignPatterns.ObserverDesignPattern.PullModel.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ShoesObservable implements Observable {

    List<Observer> observerList = new ArrayList<>();
    public int stock = 0;

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void refillStock(int newStock) {
        int stockBeforeRefill = stock;
        stock += newStock;

        if(stockBeforeRefill == 0){
            doNotify();
        }
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void clearStock() {
        stock = 0;
    }

    @Override
    public void doNotify() {
        for(Observer observer : observerList){
            observer.update();
        }
    }
}