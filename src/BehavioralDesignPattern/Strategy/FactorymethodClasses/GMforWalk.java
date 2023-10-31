package BehavioralDesignPattern.Strategy.FactorymethodClasses;

import BehavioralDesignPattern.Strategy.strategies.PathFinder;
import BehavioralDesignPattern.Strategy.strategies.WalkPathFinder;

public class GMforWalk extends GoogleMaps {
    @Override
    PathFinder gpf() {
        return new WalkPathFinder();
    }
}
