package BehavioralDesignPattern.Observer;

import java.security.PublicKey;

public class SMSService implements  CreateOrderObserver{

    public SMSService(){
        // register  to main  service
        MainService.inst.register(this);
    }
    @Override
    public void newOrderCreated(OrderDetails od) {
        System.out.println("logic to send SMS ");
    }


}
