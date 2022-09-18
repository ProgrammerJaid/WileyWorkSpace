package com.dayAssignment;

public class StringWork {

	private String s;

	public StringWork(String s) {
		this.s = s;
	}
	
	public void reverse() {
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse().toString());
	}
	
	public int findOccurence(char c) {
		int count=0;
		for(char ch:s.toCharArray())
			if(ch==c)
				count++;
		return count;
	}
	
	public static boolean checkAnagram(String s1,String s2) {
		int[] store = new int[26];
		
		if(s1.length()!=s2.length())	return false;
		
		for(char c:s1.toCharArray())
			store[c-'a']++;
		
		for(char c:s2.toCharArray()) {
			store[c-'a']--;
			if(store[c-'a']<0)	return false;
		}
		
		for(int i:store)
			if(i!=0)	return false;
		return true;
	}
}
