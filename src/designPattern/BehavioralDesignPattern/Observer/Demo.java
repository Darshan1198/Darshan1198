package designPattern.BehavioralDesignPattern.Observer;

public class Demo {
    public static void main(String[] args) {


       SMSService smaService  = new SMSService();
       EmailService emailService = new EmailService();

       MainService.inst.createOrder();
//        MainService ms  = new MainService();  instead  i will creat the

    }
}
