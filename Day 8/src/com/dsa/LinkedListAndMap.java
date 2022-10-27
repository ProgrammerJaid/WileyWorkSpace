package com.dsa;

import java.util.Arrays;

public class LinkedListAndMap {

	public static void main(String[] args) {
		char[] nuts={'$', '%', '#', '&','@'};
		char[] bolts={'@','#','$','%','&'};
		
		int cnt=0;
		
		for(int i=0;i<nuts.length;i++)
			if(nuts[i]==bolts[i])	continue;
			else	cnt++;

		System.out.println(cnt);
		System.out.println(Arrays.toString(nuts)+" "+Arrays.toString(nuts));
		
	}
}
