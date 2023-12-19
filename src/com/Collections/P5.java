package com.Collections;
// Write to program to demonstate clear()   

import java.util.ArrayList;
import java.util.List;

public class P5 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("JAVA");
		l1.add(21);
		l1.add('k');
		
		List l2 = new ArrayList();
		l2.add("Best");
		l2.add("in");
		l2.add("JAVA");
		System.out.println("Element in l2 before addAll() : "+ l2);
		l2.addAll(l1);
		System.out.println("Element in l2 after addAll() : "+ l2);
		l2.clear();
		System.out.println("After clear() elements in l2 : "+ l2);
	}

}
