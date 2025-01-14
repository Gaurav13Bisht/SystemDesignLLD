package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Observer;

public interface Observable {
    public void register(Observer observer);
    public void deregister(Observer observer);
    public void refillStock(int stock);
    public int getStock();
    public void clearStock();
    public void doNotify();
}