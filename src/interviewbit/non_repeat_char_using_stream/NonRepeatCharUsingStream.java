package interviewbit.non_repeat_char_using_stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NonRepeatCharUsingStream {

    public static void main(String[] args) {


        int i2 = 1;
        for(System.out.print("Hello world");i2<2; System.out.print(" of java"))
        {
            i2++;
        }


        List list = List.of('a','b','c','d','a','e','b','d','a','b');

        List list1 = List.of('a','a','b','c','c','d');

        /**
         * Solution One using Collector.groupingBy
         * */
        System.out.println(solution_1(list));


        /**
         * Solution Two using Collections.frequency
         */
        System.out.println(solution_2(list));


        /**
         *
         * Solution Three using Set
         * */
        System.out.println(solution_3(list1));

//        String st1 = "abc";
//        String st2 = new String("abc");
//        st2.intern();
//            System.out.println(st1 == st2);
//
//
//        List<String> fruits =  Arrays.asList("apple", "mango");
//        Set<String> charSet = fruits.stream().map(fruit -> fruit.split("")).flatMap(Arrays::stream).collect(Collectors.toSet());
//        System.out.println(charSet);

        String s = "III";
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
            for (int i = s.length() -1; i >= 0 ; i--) {
                int finalI = i;
                Predicate<Map.Entry<Character, Integer>> ifMatchExists = entry -> entry.getKey() == s.charAt(finalI);
                int temp = map.entrySet().stream().filter(ifMatchExists).map(Map.Entry::getValue).findFirst().get();
                if (temp >= prev)
                    sum = sum + temp;
                else
                    sum = sum - temp;
               prev = temp;
                System.out.println(sum);
            }



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


    public static List solution_3(List<Character> list) {
        Set<Character> set = new HashSet();
        Stack<Character> stack = new Stack<>();
        //Collections.sort(list);
        for( Character ch : list) {
            if(set.add(ch)){
                stack.add(ch);
            } else
                stack.pop();
        }
        return stack.stream().toList();


    }



}
