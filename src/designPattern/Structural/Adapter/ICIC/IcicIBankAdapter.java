package designPattern.Structural.Adapter.ICIC;

import designPattern.Structural.Adapter.BankAPIforPhonepay;

public class IcicIBankAdapter implements BankAPIforPhonepay {

    ICICbank_remote ic = new ICICbank_remote();


    @Override
    public int checkBal(int Ano) {
        return ic.whatIsbalance(Ano);
    }

    @Override
    public void addMoney(int Ano, int money) {
        ic.putMoney(Ano,money);

    }

    @Override
    public void subMoney(int Ano, int money) {
        ic.removeMoney(Ano,money);

    }
}
