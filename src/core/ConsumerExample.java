package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //List<String> list = List.of("a","b","c","d","e"); this will throw error as List is immutable.

        List<String> list = Arrays.asList("a","b","c","d","e");

        Consumer<String> printList = t -> System.out.println(t);
        list.forEach(printList);



        /**
         * Multiple Consumers
         * **/

        Consumer<List<String>> uppperCase = l ->
        {
            for(int i=0; i< l.size(); i++ ) {
                l.set(i, l.get(i).toUpperCase(Locale.ROOT));
            }
        };

        Consumer<List<String>> printList1 = l -> l.stream().forEach(System.out::println);

        uppperCase.andThen(printList1).accept(list);

    }
}
