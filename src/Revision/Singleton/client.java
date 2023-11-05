package Revision.Singleton;

import designPattern.CreationalDesignPattern.Singleton.Singleton;

public class client {

    public static void main(String[] args) {
        Singleton sc  = Singleton.getInstance();
        Singleton s2  = Singleton.getInstance();
        System.out.println(sc+ " " +s2);
    }
}
