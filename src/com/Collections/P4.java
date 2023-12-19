package com.Collections;
import java.util.List;
import java.util.ArrayList;

public class P4 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("Tiger");
		l1.add(21.202929292d);
		l1.add(2929);
		
		List l2 = new ArrayList();
		l2.add("Forest");
		l2.add("24hr");
		l2.add(30);
		
		System.out.println("Element in l2 before addAll() : "+ l2);
		l2.addAll(l1);
		System.out.println("Element in l2 after addAll() : "+l2);
		l2.removeAll(l1);
		System.out.println("element in l2 after removeAll() :  "+l2);
	}
	
	

}
