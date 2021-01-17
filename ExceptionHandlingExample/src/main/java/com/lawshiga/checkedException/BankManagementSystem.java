package com.lawshiga.checkedException;

import com.lawshiga.bankManagement.BankAccount;
import com.lawshiga.bankManagement.BankService;
import com.lawshiga.exception.UserNotFoundException;

import java.util.Scanner;

public class BankManagementSystem {

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        BankService bankService = new BankService();

        System.out.print("Enter the account number: ");
        BankAccount.setAccountNumber(userInput.next());

        try {
            bankService.authenticateUser(BankAccount.getAccountNumber());
        } catch (UserNotFoundException e) {
            System.out.println("Authentication failed for this account Number : " + e);
        }
    }
}
