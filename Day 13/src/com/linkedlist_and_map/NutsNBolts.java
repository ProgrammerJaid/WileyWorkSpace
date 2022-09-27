package com.linkedlist_and_map;

import java.util.Arrays;

public class NutsNBolts {

	public static void sort(char[] nuts,char[] bolts) {
		
		int minIt=0;
		for(int i=0;i<nuts.length;i++) {
			for(int j=i;j<bolts.length;j++) {
				if(nuts[i]==bolts[j]) {
					swap(bolts,i,j);
					break;
				}
				minIt++;
			}
		}
		
		System.out.println(Arrays.toString(bolts));
		System.out.println(minIt);
	}
	
	private static void swap(char[] bolts, int i, int j) {
		char tmp = bolts[i];
		bolts[i] = bolts[j];
		bolts[j] = tmp;
	}

	public static void main(String[] args) {
		
		char[] nuts={'$', '%', '#', '&','@'};
		char[] bolts={'@','#','$','%','&'};
		
		sort(nuts,bolts);
	}
}
