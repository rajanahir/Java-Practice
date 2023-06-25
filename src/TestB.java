import java.util.*;
class TestA {
    public static final int x = 10;

    static {
        System.out.println('j' + 'a' + 'v' + 'a');
    }
}

public class TestB{
    public static void main(String[] args){
        int[] A = {-1,-3};
        int result = 0;
        for (int i = 1; i <= A.length + 1; i++) {
            if (Arrays.asList(A).contains(i))
                continue;
            else {
                result = i;
                break;
            }
        }
        System.out.println(result);


        TestA ab = new TestA();
        System.out.println(TestA.x);
    }

}
