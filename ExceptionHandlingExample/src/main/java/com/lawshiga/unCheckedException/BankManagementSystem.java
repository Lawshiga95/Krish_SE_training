package com.lawshiga.unCheckedException;

import com.lawshiga.bankManagement.BankAccount;
import com.lawshiga.bankManagement.BankService;
import com.lawshiga.exception.OverDraftException;

import java.util.Scanner;

public class BankManagementSystem {

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        BankService bankService = new BankService();

        System.out.print("Enter the balance in your account :");
        BankAccount.setAccountBalance(userInput.nextDouble());

        System.out.print("Enter the amount you want to withdraw :");

        try{
            bankService.withdrawCash(userInput.nextDouble());
        } catch (OverDraftException e) {
            throw new OverDraftException("Amount you want to withdraw exceeds your current balance : " );
        }
    }
}
