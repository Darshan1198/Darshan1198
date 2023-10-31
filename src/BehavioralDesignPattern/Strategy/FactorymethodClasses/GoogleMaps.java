package BehavioralDesignPattern.Strategy.FactorymethodClasses;

import BehavioralDesignPattern.Strategy.strategies.PathFinder;

public abstract class GoogleMaps implements PathFinder {
    @Override
    public void findPath(String from, String to) {
        PathFinder pf  = gpf();
    }

    abstract  PathFinder gpf();  // this  is factory method

}
