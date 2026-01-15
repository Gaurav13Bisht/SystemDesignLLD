package DesignPatterns.ObserverDesignPattern.PushModel.Observable;

import DesignPatterns.ObserverDesignPattern.PushModel.Observer.Observer;
import DesignPatterns.ObserverDesignPattern.PushModel.Stock;

/*

The Observer pattern is a behavioral design pattern that defines a one-to-many dependency between
objects. When the state of one object (the subject or publisher) changes, all its dependent objects
(the observers or subscribers) are automatically notified and updated, promoting loose coupling
between components.

 */


// This is Push Model in which Observable update the observers that there is a change in it and also
// send all the required data to the Observers

public interface Observable {
    public void register(Observer observer);
    public void deregister(Observer observer);
    public void updateStock(Integer quantity, Integer price);
    public Stock getStock();
    public void clearStock();
    public void doNotify();
}