package interviewbit.non_repeat_char_using_stream;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NonRepeatCharUsingStream {

    public static void main(String[] args) {
        List list = List.of('a','b','c','d','a','e','b','d','a','b');

        /**
         * Solution One using Collector.groupingBy
         * */
        System.out.println(solution_1(list));


        /**
         * Solution Two using Collections.frequency
         */
        System.out.println(solution_2(list));
    }

    public static List solution_1(List list) {
        Predicate<Map.Entry<Character, Long>> ifLessThenOrEqualsToOne = i  -> i.getValue() < 2;
        Map<Character, Long> map = (Map) list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return map.entrySet().stream().filter(ifLessThenOrEqualsToOne).map(Map.Entry::getKey).toList();

    }


    public static List solution_2(List list) {
        Predicate<Character> ifLessThenOrEqualsToOne = i -> Collections.frequency(list, i) < 2;
        return list.stream().filter(ifLessThenOrEqualsToOne).toList();
    }

}
