package core;

import java.util.Arrays;

public class OprationsOnArray {

    public static void main(String[] args) {
        int[] array = { 1,2,3,4,5,6,7,8,9,10,11,12 };
        System.out.println(Arrays.toString(counterClockRotation(array, 2)));
    }

    public static int[] counterClockRotation(int[] a, int k) {
        int[] temp = new int[k];
        for (int i = 0; i < a.length; i++) {
            if (i < k)
                temp[i] = a[i];
            if (i < a.length - k)
                a[i] = a[i+k];

         }
    return  a;

    }
}
