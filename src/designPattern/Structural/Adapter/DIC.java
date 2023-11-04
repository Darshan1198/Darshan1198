package designPattern.Structural.Adapter;

import designPattern.Structural.Adapter.YESBANK.YesBankAdapters;

//dependency injecton  controller
public class DIC {

    static BankAPIforPhonepay  getBankAPi(){
        // make a call  to phone  pay server  which will read from config  which adapter to give;
//        return   new IcicIBankAdapter();
          return  new YesBankAdapters();
    }
}
