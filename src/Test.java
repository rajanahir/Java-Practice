import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String name = "virendra";
        List<String> sorted = Stream.of(name)
                .sorted().collect(Collectors.toList());
        System.out.println(sorted);
    }

}
