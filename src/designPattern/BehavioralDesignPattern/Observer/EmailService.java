package designPattern.BehavioralDesignPattern.Observer;

public class EmailService implements  CreateOrderObserver {
    EmailService(){
        //register to the  main service
        MainService.inst.register(this);

    }

    @Override
    public void newOrderCreated(OrderDetails od) {
        System.out.println("logic to send email");

    }
}
