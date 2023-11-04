package designPattern.BehavioralDesignPattern.Strategy.FactorymethodClasses;

import designPattern.BehavioralDesignPattern.Strategy.strategies.CarPathFinder;
import designPattern.BehavioralDesignPattern.Strategy.strategies.PathFinder;

public class GMforcar extends GoogleMaps {
    @Override
    PathFinder gpf() {
        return new CarPathFinder();
    }
}
