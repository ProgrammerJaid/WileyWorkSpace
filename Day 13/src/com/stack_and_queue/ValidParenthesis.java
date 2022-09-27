package com.stack_and_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {

	public static boolean checkParenthesis(String s) {
		
		Deque<Character> stack = new ArrayDeque<>();
		for(char ch:s.toCharArray()) {
			
			switch(ch) {
			
			case ')':
				if(stack.pop()!='(')
					return false;
			case '}':
				if(stack.pop()!='{')
					return false;
			case ']':
				if(stack.pop()!='[')
					return false;
			default:
				stack.push(ch);
				break;
			}
		}
		
		return true;
	}
}
