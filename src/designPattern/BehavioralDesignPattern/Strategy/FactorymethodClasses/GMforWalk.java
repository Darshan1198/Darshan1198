package designPattern.BehavioralDesignPattern.Strategy.FactorymethodClasses;

import designPattern.BehavioralDesignPattern.Strategy.strategies.PathFinder;
import designPattern.BehavioralDesignPattern.Strategy.strategies.WalkPathFinder;

public class GMforWalk extends GoogleMaps {
    @Override
    PathFinder gpf() {
        return new WalkPathFinder();
    }
}
