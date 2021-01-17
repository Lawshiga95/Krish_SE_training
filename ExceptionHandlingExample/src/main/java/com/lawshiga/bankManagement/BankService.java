package com.lawshiga.bankManagement;

import com.lawshiga.exception.*;

public class BankService {

    public BankService(){

    }
    public void validateAccount(String account) throws InvalidAccountException{
        String regExpression = "[0-9]{2}-[0-9]{3}-[0-9]{6}";
        if(BankAccount.getAccountNumber().matches(regExpression)) {
            System.out.println("Account validation successful....");
        } else {
            throw new InvalidAccountException("Account number should be 11 digit and should be separated with hyphen");
        }
    }

    public void authenticateUser(String accountNo) throws UserNotFoundException {
        try {
            validateAccount(accountNo);
        } catch (InvalidAccountException e) {
            throw new UserNotFoundException("This account does not exist", e);
        }
    }

    public void authenticateTransaction(String account) throws IllegalTransactionException {
        try {
            authenticateUser(account);
        } catch (UserNotFoundException e) {
            throw new IllegalTransactionException("Transaction could not be made with this account", e);
        }
    }

    public void withdrawCash(double amount) throws OverDraftException {
            if(amount > BankAccount.accountBalance) {
                throw new OverDraftException("Withdrawal exceeds the balance limit");
            }
        BankAccount.accountBalance -= amount;
        System.out.println("Withdrawal successful...");
    }

    public void depositCash(double amount) throws InvalidDepositException {
        if(amount <= 0) {
            throw new InvalidDepositException("Deposit amount should be more than zero");
        }
        BankAccount.accountBalance += amount;
        System.out.println("deposit successful...");
    }
}
