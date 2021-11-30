package com.marinagaisina;

import java.util.Scanner;

public class LoopSwitchScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean breathe = true;
        double practiceJava = 0;
        while(breathe) {
            System.out.println("Still practicing Java? (yes/no): ");
            String answer = scan.nextLine();
            switch (answer) {
                case "yes":
                    System.out.println("Keep going! Great job!");
                    practiceJava += 1;
                    System.out.printf("Your practice score is: %2.2f", practiceJava);
                    break;
                case "no":
                    System.out.println("No practice, no breathe!");
                    System.out.printf("Your practice score is: %2.2f%n", practiceJava);
                    breathe = false;
                    break;
                default:
                    System.out.println("Please type \"yes\" or \"no\"");
            }
        }
        System.out.println("The end");
    }
}
