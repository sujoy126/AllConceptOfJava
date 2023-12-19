package com.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class SetP11 {

	public static void main(String[] args) {
		LinkedHashSet hs1 =new LinkedHashSet();
		hs1.add(100);
		hs1.add("Super");
		hs1.add(99.99);
		hs1.add(99.99);
		
		LinkedHashSet hs2 = new LinkedHashSet();
		hs2.add(20);
		hs2.add(100);
		hs2.add("Hero");
		hs2.add(null);
		
		hs2.addAll(hs1);
		System.out.println(hs2);
		
		//hs1.retainAll(hs2);
		//System.out.println(hs1);
		
		//hs1.removeAll(hs2);
		//System.out.println(hs1);
		
		//hs1.containsAll(hs2);
		//System.out.println(hs2);
		
		
		System.out.println(hs2.containsAll(hs1));
		

	}

}
