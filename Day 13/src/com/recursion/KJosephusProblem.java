package com.recursion;

public class KJosephusProblem {

	public static int survive(int n,int k){
		if (n==1)return 1;
        return (survive(n-1,k)+k-1)%n+1;
    }
}
