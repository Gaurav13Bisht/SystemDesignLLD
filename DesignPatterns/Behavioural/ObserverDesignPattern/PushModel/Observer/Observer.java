package DesignPatterns.Behavioural.ObserverDesignPattern.PushModel.Observer;

import DesignPatterns.Behavioural.ObserverDesignPattern.PushModel.Stock;

public interface Observer {
    public void update(Stock stock);
}