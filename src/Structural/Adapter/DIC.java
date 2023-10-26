package Structural.Adapter;

import Structural.Adapter.ICIC.IcicIBankAdapter;

public class DIC {

    static BankAPIforPhonepay  getBankAPi(){
        // make a call  to phone  pay server  which will read from config  which adapter to give;
        return   new IcicIBankAdapter();

    }
}
