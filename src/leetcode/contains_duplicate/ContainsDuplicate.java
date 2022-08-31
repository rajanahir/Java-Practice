package leetcode.contains_duplicate;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

        /****
         * Solution 1; fast and consuming less memory
         * ***/
        int[] nums = {1,2,3,4,5,6,6};
        System.out.println(containsDuplicate(nums));

        /***
         * Solution 2: My solution that is 11ms and consming 68MB
         * https://leetcode.com/problems/contains-duplicate/submissions/
         * **/
        System.out.println(containsDuplicate_S2(nums));



    }

    /***
     * Optimized and fast solution
     * **/
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int occurance = 0;
        for (int n : nums) {
            if (map.containsKey(n)) {
                return true;
            }
            else {
                map.put(n, occurance++);
            }
        }
        return  false;
    }



    /**
     * My solutions that bit faster but consuming more memory
     *
     * ***/
    public static boolean containsDuplicate_S2(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int a : nums)
            if(!set.add(a))
                return true;
        return false;
    }
}
