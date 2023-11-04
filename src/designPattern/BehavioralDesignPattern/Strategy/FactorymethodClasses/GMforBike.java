package designPattern.BehavioralDesignPattern.Strategy.FactorymethodClasses;

import designPattern.BehavioralDesignPattern.Strategy.strategies.BikePathFinder;
import designPattern.BehavioralDesignPattern.Strategy.strategies.PathFinder;

public class GMforBike extends GoogleMaps {

    @Override
    PathFinder gpf() {
        return  new BikePathFinder();
    }
}
