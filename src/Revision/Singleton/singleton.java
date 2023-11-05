package Revision.Singleton;

import designPattern.CreationalDesignPattern.Singleton.Singleton;

public class singleton {
    private  static  singleton  instance;

    public singleton(){

    }

    private   static singleton getInstance(){
        if(instance  == null){
            synchronized (singleton.class){
                if(instance  == null){
                    instance  = new singleton();
                }
            }
        }
        return  instance;
    }
}
