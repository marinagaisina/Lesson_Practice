package com.marinagaisina;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String str = "Welcome to Java";
        String subStr = str.substring(1,8);
        System.out.printf("%s%n", subStr);
        str = str.toLowerCase();
        System.out.printf("%s%n", str);
    }
}
