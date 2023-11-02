package BehavioralDesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class MainService {


    public  static final  MainService inst = new MainService();
    private  MainService(){

    }


    private List<CreateOrderObserver> observers = new ArrayList<>();

    public  void  register(CreateOrderObserver obs){
        observers.add(obs);
    }
    public  void  unregister( CreateOrderObserver obs ){
        observers.remove(obs);
    }

    void  createOrder(){

        System.out.println("call the  facad and create the  order");
        OrderDetails od  = new OrderDetails(); // this  will be  recieved  from facade

        od.orderId =10;
        od.address = "Banglore";
        od.email = "abc@gmail.com";
        od.pno = "373372";

        for  (CreateOrderObserver obs: observers){
            obs.newOrderCreated(od);
        }

    }
}
