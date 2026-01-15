package DesignPatterns.ObserverDesignPattern.PushModel.Observer;

import DesignPatterns.ObserverDesignPattern.PushModel.Stock;

public interface Observer {
    public void update(Stock stock);
}