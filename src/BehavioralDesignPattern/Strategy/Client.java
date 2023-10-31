package BehavioralDesignPattern.Strategy;

import BehavioralDesignPattern.Strategy.FactorymethodClasses.*;
import BehavioralDesignPattern.Strategy.strategies.PathFinder;

public class Client {
    public static void main(String[] args) {

        Transportationmode mode  = Transportationmode.CAR;
        GoogleMaps gm;
        gm = getpathfinder(x);
        gm.findPath("Banglore","Mysore");




        }
    public static PathFinder getpathfinder(Transportationmode mode){
        return switch (mode){
            case CAR -> new GMforcar();
            case BIKE -> new GMforBike();
            case WALK -> new GMforWalk();

        };
    }

}
