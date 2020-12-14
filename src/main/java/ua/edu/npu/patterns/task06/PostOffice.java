package ua.edu.npu.patterns.task06;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Observable {

    List<Observer> subscribers = new ArrayList<>();

    public void recieveMagazines () {
        notifyObservers();
    }

    @Override
    public void register(Observer obj) {
        this.subscribers.add(obj);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: subscribers) {
            observer.update();
        }
    }
}
