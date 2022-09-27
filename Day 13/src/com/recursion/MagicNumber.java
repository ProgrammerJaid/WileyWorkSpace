package com.recursion;

public class MagicNumber {

	public static int magicnumber(int i, int[] arr) {
		int m = -1;
		if (i >= arr.length)
			return m;
		if (arr[i] == i) {
			m = i;
			return m;
		} else {
			m = magicnumber(i + 1, arr);
		}
		return m;
	}
}
