package thedailybyte;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * This question is asked by Google. Given a string, reverse all of its characters and return the resulting string.
 *
 * Ex: Given the following strings...
 *
 * “Cat”, return “taC”
 * “The Daily Byte”, return "etyB yliaD ehT”
 * “civic”, return “civic”
 *
 *
 * */

public class ReverseStirng {
    public static void main(String[] args) {
        String input = "The Daily Byte";
        System.out.println(reverse(input));
    }

    public static String reverse(String str) {
        String temp = "";
        for (char s : str.toCharArray())
            temp = s + temp;
        return temp;
    }


}
