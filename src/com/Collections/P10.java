package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class P10 {
	public static void main(String[] args) {
		List l1= new ArrayList();
		l1.add(20);
		l1.add(50);
		l1.add(100);
		System.out.println("before using get() : "+l1);
		
		int i= (Integer)l1.get(0);
		System.out.println("After using get() of index : "+i);
		System.out.println("\n");
		
		System.out.println("Check lion is availabe in list : "+l1.contains("lion"));
		System.out.println("\n");
		
		System.out.println("After convertion collection into array");
		Object obj[] =  l1.toArray();
		for(int j=0; j<obj.length; j++)
		{
			System.out.println(obj[j]);
		}
		
		
		System.out.println("Before using set() : "+l1);
		l1.set(1, "Eagle");
		System.out.println(l1);
	}
}
