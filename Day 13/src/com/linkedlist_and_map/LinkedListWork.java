package com.linkedlist_and_map;

import java.util.LinkedList;

public class LinkedListWork {

	public static void lastNodeToFirst() {
		LinkedList<Integer> llist = new LinkedList<>();
		llist.addFirst(5);
		llist.addFirst(4);
		llist.addFirst(3);
		llist.addFirst(2);
		llist.addFirst(1);
		llist.addFirst(llist.removeLast());
		System.out.println(llist);
	}

	public static void removeDuplicates() {
		LinkedList<Integer> llist=new LinkedList<>();
		llist.addFirst(5);
		llist.addFirst(5);
		llist.addFirst(4);
		llist.addFirst(4);
		llist.addFirst(4);
		llist.addFirst(4);
		llist.addFirst(4);
		llist.addFirst(4);
		llist.addFirst(3);
		llist.addFirst(3);
		llist.addFirst(2);
		llist.addFirst(1);
		llist.addFirst(1);
		for(int i=0;i<llist.size()-1;i++)
		{
			for(int j=i+1;j<llist.size();j++)
			{
				if(llist.get(i)==llist.get(j))
				{
					llist.remove(llist.get(j));
					j--;
				}
			}
		}
		System.out.println(llist);
	}
}
