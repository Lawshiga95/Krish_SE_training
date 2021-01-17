package com.lawshiga.designPattern.singleton;

public class Application {

    public static void main(String args[]) {
        BankLogger bankLogger1 = BankLogger.getBankLogger();
        BankLogger bankLogger2 = BankLogger.getBankLogger();
        BankLogger bankLogger3 = BankLogger.getBankLogger();

        bankLogger1.logDeposit("11-123-145645", 1200);
        bankLogger1.logDeposit("22-45-0906702",800);
        bankLogger2.logDeposit("09-345-234323",1000);
        bankLogger3.logWithdraw("43-552-326742",5000);
    }

}
