package BehavioralDesignPattern.Strategy.strategies;

import BehavioralDesignPattern.Strategy.strategies.PathFinder;

public class CarPathFinder implements PathFinder {
    @Override
    public void findPath(String from, String to) {
        System.out.println("Path findind  for car  via "+from+ "to" +to);

    }
}
