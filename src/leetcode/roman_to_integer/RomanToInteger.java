package leetcode.roman_to_integer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class RomanToInteger {
    public static void main(String[] args) {

        /***
         * Input: s = "III"
         * Output: 3
         * Explanation: III = 3.
         * */
        System.out.println(romanToInt("III"));

        /***
         * Input: s = "LVIII"
         * Output: 58
         * Explanation: L = 50, V= 5, III = 3.
         * */
        System.out.println(romanToInt("LVIII"));

        /***
         * Input: s = "MCMXCIV"
         * Output: 1994
         * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
         * */
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0 ;
        int prev = 0;

        if (s.length() > 0) {

            for (int i = s.length() -1; i >= 0 ; i--) {
                int finalI = i;
                Predicate<Map.Entry<Character, Integer>> ifMatchExists = entry -> entry.getKey() == s.charAt(finalI);
                int temp = map.entrySet().stream().filter(ifMatchExists).map(Map.Entry::getValue).findFirst().get();
                if (temp >= prev)
                    sum = sum + temp;
                else
                    sum = sum - temp;
                prev = temp;
            }

        }
        return sum;

    }
}
