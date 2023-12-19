package com.Collections;
import java.util.Vector;
import java.util.Stack;

public class StackP11 {
	 
	public static void main(String[] args) {
		Stack l = new Stack();
		l.add("INDIA");
		l.add(28);
		l.add(23.3);
	    System.out.println(l);
		System.out.println("peek() fetch the last object in stack : "+l.peek());
		System.out.println("pop() fetch the last object and remove it from the stack "+l.pop());
		System.out.println(l);
		
		
		
		
	} 

}
