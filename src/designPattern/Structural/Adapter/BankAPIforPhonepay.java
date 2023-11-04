package designPattern.Structural.Adapter;

public interface BankAPIforPhonepay {

    int  checkBal( int  Ano);
    void addMoney( int  Ano, int money);

    void subMoney( int Ano , int money);

}
