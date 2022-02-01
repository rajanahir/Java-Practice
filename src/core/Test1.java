package core;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

import functionalInterface.StringPassword;

public class Test1 {

//	Find pair of number whose sum is closer to 0
//	12, -7, 9, -3, 23, 8, -18, 14, 43, -2, 5,25

	public static void main(String[] args) {

		Test1 t = new Test1();
		System.out.println(t.pair());
		StringPassword a = new StringPassword();
		System.out.println(a);
	}

	public static Object pair() {

		int[] a = { 12, -7, 9, -3, 23, 8, -18, 14, 43, -2, 5, 25 };
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		int min_sum = a[0] + a[1];
		int minl = 0;
		int minr = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {

				int sum = a[i] + a[j];
				if (Math.abs(sum) < Math.abs(min_sum)) {
					min_sum = sum;
					minl = i;
					minr = j;
				}
			}
		}
		System.out.println(a[minl] + "," + a[minr]);
		return null; // map.get(map.navigableKeySet().stream().findFirst().get());

	}

}
