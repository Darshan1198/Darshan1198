package BehavioralDesignPattern.Strategy.FactorymethodClasses;

import BehavioralDesignPattern.Strategy.strategies.CarPathFinder;
import BehavioralDesignPattern.Strategy.strategies.PathFinder;

public class GMforcar extends GoogleMaps {
    @Override
    PathFinder gpf() {
        return new CarPathFinder();
    }
}
