package designPattern.CreationalDesignPattern.Singleton.Syncronzedmethod;

public class Singleton1 {
    private  static Singleton1 instance1;


    private  Singleton1(){

    }

    public  static synchronized Singleton1 getInstance1(){  // using synchronized method
        if(instance1 == null){
            instance1 = new Singleton1();
        }
        return  instance1;
    }
}
