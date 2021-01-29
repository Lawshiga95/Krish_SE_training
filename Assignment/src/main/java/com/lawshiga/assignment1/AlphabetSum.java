package com.lawshiga.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class AlphabetSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to count its location of letters to find sum");
        String word = input.nextLine();

        ArrayList<Character> list = new ArrayList<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int size = alphabet.length();
        int i,j;
        for(i=0; i<size; i++) {
            list.add(alphabet.charAt(i));
        }
        int sum = 0;
        for(i=0; i<size; i++){
            for(j=0; j<word.length(); j++) {
                if(word.charAt(j) == list.get(i)){
                    sum += (i+1);
                }
            }
        }
        System.out.println("Your word sum is :" + sum);
    }
}
