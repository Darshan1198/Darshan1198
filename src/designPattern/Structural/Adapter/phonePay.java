package designPattern.Structural.Adapter;

public class phonePay {

    BankAPIforPhonepay ob  = DIC.getBankAPi();

    int checkbalace(){
        return  ob.checkBal(100);
    }

    void depMoney(){
        ob.addMoney(100,  700);
    }

    void  withdrawMoney(){
        ob.subMoney(100,  200);

    }

    public static void main(String[] args) {

        phonePay obj  = new phonePay();

        obj.checkbalace();

    }
}
