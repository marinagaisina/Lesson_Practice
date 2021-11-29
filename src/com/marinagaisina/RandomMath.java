package com.marinagaisina;

public class RandomMath {
    public static void main(String[] args) {
        int min = 5;
        int max = 55;
        int range = max - min + 1;
        double randomNumber = Math.random()*range + min;
        System.out.printf("Random number from %d to %d is: %2.2f", min, max, randomNumber);
    }
}
