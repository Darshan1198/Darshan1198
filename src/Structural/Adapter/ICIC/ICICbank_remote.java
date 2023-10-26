package Structural.Adapter.ICIC;

public class ICICbank_remote    {

    int  whatIsbalance(int Ano){
        System.out.println("makes call to ICIC  for  checking  balance ");
        return 0;

    }

    void putMoney(int Ano,  int  money){
        System.out.println("makes call to icic for depositing ");

    }
    void removeMoney(int  Ano, int  money){
        System.out.println("makes call to icic for withdrawing  ");

    }
}
