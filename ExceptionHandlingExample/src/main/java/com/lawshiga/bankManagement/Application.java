package com.lawshiga.bankManagement;

import com.lawshiga.exception.IllegalTransactionException;
import com.lawshiga.exception.UserNotFoundException;

import java.util.Scanner;

public class Application {

    public static void main(String args[])  {
        try {
            Scanner userInput = new Scanner(System.in);
            BankService bankService = new BankService();

            System.out.print("Enter the account holder name: ");
            BankAccount.setAccountHolder(userInput.next());

            System.out.print("Enter the account number: ");
            BankAccount.setAccountNumber(userInput.next());

            System.out.print("Enter the account balance: ");
            BankAccount.setAccountBalance(userInput.nextDouble());

            System.out.println("Enter the amount you want to withdraw: ");

            bankService.authenticateTransaction(BankAccount.getAccountNumber());


            bankService.withdrawCash(userInput.nextDouble());

            System.out.println("Enter the amount you want to deposit: ");
            bankService.depositCash(userInput.nextDouble());
        } catch (IllegalTransactionException e) {
            System.out.println("Unauthorized Transaction");
        }
    }
}
