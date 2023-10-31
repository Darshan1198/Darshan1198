package BehavioralDesignPattern.Strategy.strategies;

import BehavioralDesignPattern.Strategy.strategies.PathFinder;

public class WalkPathFinder implements PathFinder {
    @Override
    public void findPath(String from, String to) {
        System.out.println("path via"+from+"to"+ to);

    }
}
