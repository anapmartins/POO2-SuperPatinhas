package superPatinhas.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<AdocaoObserver> monitores = new ArrayList<>();

    void addObserver(AdocaoObserver observer) {

        monitores.add(observer);
    }

    void delete(AdocaoObserver observer) {

        monitores.remove(observer);
    }

    void notifyObserver() {

        for (AdocaoObserver ob : monitores) {
            ob.update(this);
        }
    }

    public List<AdocaoObserver> getMonitores() {
        return monitores;
    }
}
