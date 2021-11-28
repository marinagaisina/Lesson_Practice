package com.marinagaisina;

public class CompareStrings {
    public static void main(String[] args) {
        String s1 = new String("test");
        String s2 = new String("test");
        String s3 = s1;
        System.out.println("s1 == s2:\t\t" + (s1 == s2));
        System.out.println("s1 == s3:\t\t" + (s1 == s3));
        System.out.println("s2 == s3:\t\t" + (s2 == s3));
        System.out.println("s1.equals(s2):\t" + s1.equals(s2));
    }
}
