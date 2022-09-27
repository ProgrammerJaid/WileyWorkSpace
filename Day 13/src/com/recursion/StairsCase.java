package com.recursion;

public class StairsCase {

	public static int noOfWays(int n) {
		if(n<0)
			return 0;
		if(n==0)
			return 1;
		return noOfWays(n-1)+noOfWays(n-2)+noOfWays(n-3);
	}
}
