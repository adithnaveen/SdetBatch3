package com.fannie.collections;

import java.util.Stack;

public class ListEx3 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("siva");
		stack.push("itishree");
		stack.push("parag");
		
		System.out.println(stack);
		stack.push("chitti");
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		// peek will not take the element out it will only display 
		System.out.println(stack.peek());
		System.out.println(stack);
	}
}
