package com.anushagarg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //MINI PROJECT
        Scanner sc = new Scanner(System.in) ;
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.print("Guess my number");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WooHoo.... correct number");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your Number is too large");
            } else {
                System.out.println("Your number is too small");
            }
        }while (userNumber >= 0);
        System.out.print("my Number was:");
        System.out.println( myNumber);

    }
}

