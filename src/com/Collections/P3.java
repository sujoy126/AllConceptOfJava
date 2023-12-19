package com.Collections;
import java.util.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class P3 {
	public static void main(String[] args) {
		List l1= new LinkedList();
		l1.add("Lion");
		l1.add("Tiger");
		l1.add("Mouse");
		l1.add("Cat");
		l1.add("Dog");
		l1.add("Zebra");
		
		System.out.println("Element in l1 before add in index 4 : "+l1);
		l1.add(4, "Elephent");
		System.out.println("Element in l1 after add in index 4 : "+ l1);
		
		l1.remove(2);
		System.out.println("Remove index no 2 : "+l1);
		
		List l2= new ArrayList();
		l2.add("Lion");
		l2.add("Tiger");
		l2.add("Mouse");
		l2.add("Cat");
		l2.add("Dog");
		l2.add("Zebra");
		
		System.out.println("Element in l1 before add in index 4 : "+l2);
		l2.add(4, "Elephent");
		System.out.println("Element in l1 after add in index 4 : "+ l2);
		
		l2.remove(2);
		System.out.println("Remove index no 2 : "+l2);
	}

}
