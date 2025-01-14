package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.Observable;

public class EmailNotificationObserver implements Observer{

    public Observable observable;

    public EmailNotificationObserver(Observable observable){
        this.observable = observable;
    }

    @Override
    public void update() {
        if(observable.getStock() == 0){
            System.out.println("Notified via E-Mail: Out of stock !");
        }
        else{
            System.out.println("Notified via E-mail: Stock is back.");
        }
    }
}
