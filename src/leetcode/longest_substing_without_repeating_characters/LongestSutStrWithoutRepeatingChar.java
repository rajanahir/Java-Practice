package leetcode.longest_substing_without_repeating_characters;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestSutStrWithoutRepeatingChar {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
//        "abcabcbb"
//        "bbbbb"
//        ""
    }

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> hSet = new HashSet<>();
        int max = 0;
        int i = 0;
        int j = 0;

        while(i<s.length())
        {
            if(!hSet.contains(s.charAt(i)))
            {
                hSet.add(s.charAt(i));
                i++;

            }
            else
            {
                max = Math.max(max,hSet.size());
                hSet.remove(s.charAt(j));
                j++;
            }
        }
        max = Math.max(max,hSet.size());
        return max;
    }

}
