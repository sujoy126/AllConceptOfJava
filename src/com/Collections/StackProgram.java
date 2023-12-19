package com.Collections;

import java.util.Stack;

public class StackProgram {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.add(30);
		st.add(20.22);
		st.add("amazon");
		st.add('s');
		System.out.println("Before using peek method "+st);
		System.out.println(st.peek());
		System.out.println("after using peek method "+st);
		System.out.println(st.pop());
		System.out.println(st);
	}

}
