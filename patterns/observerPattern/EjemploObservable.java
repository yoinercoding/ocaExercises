package observerPattern;

import java.util.Set;
import java.util.HashSet;

public class EjemploObservable implements Observable {
    Set<Observer> observerSet = new HashSet<>();

    @Override
    public void addObserver(Observer o) {
        observerSet.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observerSet.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerSet) {
            observer.update();
        }
    }
}
