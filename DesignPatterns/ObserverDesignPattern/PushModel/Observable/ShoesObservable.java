package DesignPatterns.ObserverDesignPattern.PushModel.Observable;

import DesignPatterns.ObserverDesignPattern.PushModel.Observer.Observer;
import DesignPatterns.ObserverDesignPattern.PushModel.Stock;

import java.util.ArrayList;
import java.util.List;

public class ShoesObservable implements Observable {

    List<Observer> observerList;
    private Stock stock;

    public ShoesObservable(){
        observerList = new ArrayList<>();
        stock = new Stock(0, 0);
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void updateStock(Integer quantity, Integer price) {
        this.stock = new Stock(quantity, price);
        doNotify();
    }

    @Override
    public Stock getStock() {
        return stock;
    }

    @Override
    public void clearStock() {
        stock = new Stock(0, 0);
    }

    @Override
    public void doNotify() {
        for(Observer observer : observerList){
            observer.update(this.stock);
        }
    }
}