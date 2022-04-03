package com.google.medium;

import java.util.ArrayList;

public class IntToRoman {

    /*
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    * */

    /*
    1000    500     100     50      10      5       1
    M       D       C       L       X       V       I
    1       1       4       1       4       0       4
    5       2       5       2       5       2       5
    MDDDDCLXXXXIIII
    MCMXCIV

    convert 1000
    M
    convert 900
    there are 4C's, C is in a 2 column
    take one from D make is C less than M
    CM
    convert 90
    there are 4X's, X is in the 2 column
    take one form L make it X less than C
    XC
    convert 4
    There are 4 I'sm I is in the 2 column
    take one from V(can't do that) so one less than V
    IV

    MCMXCIV
    M-1000
    CM-900
    XC-90
    IV-4


    * */

    /*
        Runtime: 26 ms, faster than 11.14% of Java online submissions for Integer to Roman.
        Memory Usage: 46.2 MB, less than 34.81% of Java online submissions for Integer to Roman.
    * */

    public static String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }

}
