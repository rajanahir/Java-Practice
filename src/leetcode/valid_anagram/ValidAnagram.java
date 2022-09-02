package leetcode.valid_anagram;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        /**
         * Solution 1: My solutions
         * **/
        System.out.println(isAnagram("anagram",  "nagaram"));


        /****
         * Solution 2: Optimized
         */
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        int counter = 0;
        for (char s1: schar) {
            if (s1 != tchar[counter])
                return false;
            counter++;
        }
        return true;
    }


   /* public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;
        int cor =0, hash = 0;
        for (int i=0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            cor ^= c1 ^ c2;
            hash += c1 * c2 - c2 * c2;

        }
        return cor ==0 && hash ==0;
    }*/

}
