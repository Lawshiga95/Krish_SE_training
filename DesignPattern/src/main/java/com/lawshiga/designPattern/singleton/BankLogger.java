package com.lawshiga.designPattern.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BankLogger {
    private static volatile BankLogger bankLogger;
    private PrintWriter printWriter;

    private BankLogger(){
        FileWriter fileWriter = null;
        try {
            String logFile = "banklog.txt";
            fileWriter = new FileWriter(logFile);
            printWriter = new PrintWriter(fileWriter,true);
        } catch (IOException exception) {
            System.out.println("Unable to process the output file");
        }
    }

    public static BankLogger getBankLogger(){
        if(bankLogger == null) {
            synchronized (BankLogger.class) {
                if(bankLogger == null) {
                    bankLogger = new BankLogger();
                }
            }
        }
        return bankLogger;
    }

    public void logWithdraw(String account, double amount){
        printWriter.println("Account:" + account +" [Withdraw amount: " + amount + "]");
    }

    public void logDeposit(String account, double amount){
        printWriter.println("Account:" + account +" [Deposit amount: " + amount + "]");
    }
}
