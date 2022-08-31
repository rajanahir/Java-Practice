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
        System.out.println(lengthOfLongestSubstring("bbbbb"));
//        "abcabcbb"
//        "bbbbb"
//        ""
    }

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> uniqueSet = new HashSet();
        int max = 0;
        int start = 0;
        int end = 0;

        while (end < s.length()) {
           if(uniqueSet.add(s.charAt(end)))  {
               end++;
           }
           else
           {
               max = end - start;
               start = end;
               end++;
               uniqueSet.clear();
           }

        }

        return max;
    }

}
