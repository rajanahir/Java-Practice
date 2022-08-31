package UobviousJava;

import java.util.*;
import java.util.function.Predicate;

public class Utils {
    public static int makeSumOutOfNull(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,5};
        Long intVal = (Arrays.stream(num).distinct().count());
        System.out.println(intVal);



        Utils utils = null;
        System.out.println((utils).makeSumOutOfNull(1, 2));



                List integer = List.of(1,2,3,4);

                Predicate<Integer> p = i -> i > 2;
                List newlist = integer.stream().filter(p).toList();

        System.out.println(newlist);

    }
}
