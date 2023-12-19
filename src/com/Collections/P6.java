package com.Collections;
import java.util.List;
import java.util.ArrayList;

public class P6 {
	public static void main(String[] args) {
		List l1 =new ArrayList();
		l1.add("Hello");
		l1.add(29292);
		l1.add(298833432829l);
		
		List l2= new ArrayList();
		l2.add("Happy");
		l2.add("New");
		l2.add("Year");
	
		
	// Before any operation
		System.out.println("Element in l1 : "+l1);
		System.out.println("Element in l2 : "+l2);
		
	// appling the element of l1 into l2
		l2.addAll(l1);
		System.out.println("Element in l2 after addAll() : "+l2);
		
	// Removing element of l2 from l2 object and keeping l1 element safe
		l2.retainAll(l1);
		System.out.println("Element in After retainAll() : "+ l2);
		
		System.out.println("using remove method remove : "+l1.remove(0));
		System.out.println(l1);
		
	}

}
