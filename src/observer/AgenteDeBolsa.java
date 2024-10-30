package observer;

import java.util.ArrayList;

public class AgenteDeBolsa {

    private ArrayList<Observer> observers = new ArrayList<>();
    private String notification;

    public void attach(Observer observer) {
        observers.add(observer);

    }

    public void detach(Observer observer) {
        observers.remove(observer);

    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(notification);
        }
    }

    public void setState(String notification) {
        this.notification = notification;
        notifyObservers();
    }


}
