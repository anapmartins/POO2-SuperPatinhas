package superPatinhas.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<AdocaoObserver> monitores = new ArrayList<>();

    public void addObserver(AdocaoObserver observer) {

        monitores.add(observer);
    }

    public void delete(AdocaoObserver observer) {

        monitores.remove(observer);
    }

    public void notifyObserver() {

        for (AdocaoObserver ob : monitores) {
            ob.update(this);
        }
    }

    public List<AdocaoObserver> getMonitores() {
        return monitores;
    }
}
