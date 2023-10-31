package BehavioralDesignPattern.Strategy.FactorymethodClasses;

import BehavioralDesignPattern.Strategy.strategies.BikePathFinder;
import BehavioralDesignPattern.Strategy.strategies.PathFinder;

public class GMforBike extends GoogleMaps {

    @Override
    PathFinder gpf() {
        return  new BikePathFinder();
    }
}
