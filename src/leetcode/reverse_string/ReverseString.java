package leetcode.reverse_string;

import java.util.Arrays;

/***
     * Write a function that reverses a string. The input string is given as an array of characters s.
     *
     * You must do this by modifying the input array in-place with O(1) extra memory.
     *
     *
     *
     * Example 1:
     *
     * Input: s = ["h","e","l","l","o"]
     * Output: ["o","l","l","e","h"]
     * Example 2:
     *
     * Input: s = ["H","a","n","n","a","h"]
     * Output: ["h","a","n","n","a","H"]
     *
     *
     * Constraints:
     *
     * 1 <= s.length <= 105
     * s[i] is a printable ascii character.
     *
     *
     * */
public class ReverseString {

        public static void main(String[] args) {
            char[] c1 = {'h','e','l','l','o'};
            char[] c2 = {'H','a','n','n','a','h'};
            reverseString(c1);
            reverseString(c2);
        }

        public static void reverseString(char[] s) {
            char temp;
            for (int i= 0; i < s.length/2; i++) {
                temp = s[i];
                s[i] = s[s.length -i -1];
                s[s.length -i -1] = temp;
            }
            System.out.println(Arrays.toString(s).toString());

        }

}
