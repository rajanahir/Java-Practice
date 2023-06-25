import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InfiniteLoop {

    public static void main(String[] args) {
        List<String> ans = new ArrayList();
        ans.add(".");
        ans.add(".");
        ans.add(".");
        ans.add(".");

        List<String> ansTemp = ans.stream().collect(Collectors.toList());
        String temp = "";
        List<String> result = new ArrayList<>();
        for (int i = 0; i < ans.size() -1; i++){
            temp = ans.get(i) + ans.get(i +1);
            if (temp.equals("..")) {
                ansTemp.set(i, "-");
                ansTemp.set(i+1, "-");
                result.add(ansTemp.toString());
                ansTemp = ans;
            }
        }
        System.out.println(result.toString());
    }
}
