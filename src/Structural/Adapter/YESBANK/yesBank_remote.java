package Structural.Adapter.YESBANK;

public class yesBank_remote {
    int  getBalance(int Ano){
        System.out.println("makes call to ICIC  for  checking  balance ");
        return 0;

    }

    void addMoney(int Ano,  int  money){
        System.out.println("makes call to icic for depositing ");

    }
    void substractMoney(int  Ano, int  money){
        System.out.println("makes call to icic for withdrawing  ");

    }
}
