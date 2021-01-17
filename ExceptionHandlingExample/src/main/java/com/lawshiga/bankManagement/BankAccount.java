package com.lawshiga.bankManagement;

public class BankAccount {

    protected static String accountNumber;
    protected static String accountHolder;
    protected static double accountBalance;

    public BankAccount(){

    }

    public static String getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(String accountNumber) {
        BankAccount.accountNumber = accountNumber;
    }

    public static String getAccountHolder() {
        return accountHolder;
    }

    public static void setAccountHolder(String accountHolder) {
        BankAccount.accountHolder = accountHolder;
    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        BankAccount.accountBalance = accountBalance;
    }
}
