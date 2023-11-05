package designPattern.CreationalDesignPattern.Singleton.Syncronzedmethod;

public class client1 {
    public static void main(String[] args) {
        Singleton1 s2 = Singleton1.getInstance1();
        Singleton1  s4  = Singleton1.getInstance1();
        System.out.println( s2+"+ \n"+s4);

    }

}
