package com.java_eight;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
//		String[] strings = new String[1];
//		Object[] objects = strings;
//		objects[0] = new Integer(1);	//Not type safe
		arr[1]='c';
		System.out.println("\nAdd at specific position:");
//		int pos = in.nextInt();
//		int ele = in.nextInt();
		int pos =2 ;
		int ele =1000;
		addElementAtPos(pos,ele,arr);
	}

	private static void addElementAtPos(int pos, int ele,int[] arr) {
		int i=0;
		int[] tmp = new int[arr.length+1];
		while(i<arr.length) {
			if(i==pos)
				break;
			tmp[i]=arr[i++];
		}
		
		for(int j=i+1;j<tmp.length;j++) {
			tmp[j]=arr[j-1];
		}
		tmp[i]=ele;
		
		System.out.println(Arrays.toString(tmp));
	}
}
