package BehavioralDesignPattern.Observer.Challange;

import java.util.ArrayList;
import java.util.Iterator;

// Implemented by Cricket data to communicate  with observers
interface Subject {
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers();
}

class CricketData implements Subject {
    int runs;
    int wickets;
    float overs;

    ArrayList<Observer> observerList;

    public CricketData() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerList.remove(observerList.indexOf(observer));
    }

    @Override
    public void notifyObservers() {
        for (Iterator<Observer> it = observerList.iterator(); it.hasNext(); ) {
            Observer o = it.next();
            o.update(runs, wickets, overs);
        }
    }

    // get latest runs from stadium
    private int getLatestRuns() {
        return 90;
    }

    // get latest wickets from stadium
    private int getLatestWickets() {
        return 2;
    }

    // get latest overs from stadium
    private float getLatestOvers() {
        return (float) 10.2;
    }

    // This method is used update displays when data changes
    public void dataChanged() {
        //get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }
}