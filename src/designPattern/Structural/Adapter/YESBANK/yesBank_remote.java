package designPattern.Structural.Adapter.YESBANK;

public class yesBank_remote {
    int  getBalance(int Ano){
        System.out.println("makes call to yesBank  for  checking  balance ");
        return 0;

    }

    void addMoney(int Ano,  int  money){
        System.out.println("makes call to yesBank for depositing ");

    }
    void substractMoney(int  Ano, int  money){
        System.out.println("makes call to Yesbank for withdrawing  ");

    }
}
