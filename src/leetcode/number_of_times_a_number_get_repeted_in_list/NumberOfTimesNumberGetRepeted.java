package leetcode.number_of_times_a_number_get_repeted_in_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberOfTimesNumberGetRepeted {

    /**
     * input: 2,3,4,2,1,2,3,43,2
     * output: 1-1, 2-4, 3-2, 4-1, 43-1
     * **/

    public static void main(String[] args) {
        int[] intArr = new int[]{2,3,4,2,1,2,3,43,2};
        String[] companies = new String[]{
                "Meta",
                "Apple",
                "Amazon",
                "Netflix",
                "Meta", // duplicate
                "Google",
                "Apple" // duplicate
        };



        //Need to call boxed method in case of int stream as it throws error while collecting intStream to map
        Map<Integer, Integer> map = Arrays.stream(intArr)
                        .boxed()
                        .collect(Collectors.toMap(Function.identity(), i -> 1, Math::addExact));
        System.out.println(map.toString());


        //Using GroupingBy
        Map<Integer, Long> map1 = Arrays.stream(intArr)
                                        .boxed()
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map1.toString());
    }
}
