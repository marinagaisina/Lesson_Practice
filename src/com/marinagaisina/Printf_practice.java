package com.marinagaisina;

import java.util.Scanner;

public class Printf_practice {
    /*
    Following is the list of conversion characters that you may use in the printf:
        %d – for signed decimal integer
        %f – for the floating point
        %o – octal number
        %c – for a character
        %s – a string
        %i – use for integer base 10
        %u – for unsigned decimal number
        %x – hexadecimal number
        %% – for writing % (percentage)
        %n – for new line = \n

        The flags list include:
        – justify left
        + if you require to output the + or minus in the formatted string.
        ^ uppercase
        0 for zero-padded numeric values

        ‘%5$ – means fifth argument
        ‘%2$ means the second argument
        ‘%10$ means tenth argument and so on.

        For displaying the hashcode, use the %h specifier. See the example code below:

        In different scenarios, you may require displaying commas with numbers e.g. showing the amount as:
        System.out.printf( "Int: %,d\n", 478547 );
     */

    /*
    Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            sc.nextLine();
            System.out.printf("%-14s %03d %n", s1, x);
        }
        System.out.println("================================");
    }
}
