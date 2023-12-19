package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Program {
	public static void main(String[] args) {
		List <Integer> l = new ArrayList<Integer>();
		l.add(null);
		l.add(null);
		l.add(10);
		l.add(49);
		l.add(23);
		System.out.println("before using Iterator : "+l);

		
		System.out.println("After using Iterator : ");
		Iterator<Integer> i = l.iterator();
		
		while(i.hasNext())
		{
			Integer s =(Integer)i.next();
			System.out.println(s);
		}
		
	}
	
}


