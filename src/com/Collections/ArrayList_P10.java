package com.Collections;
import java.util.List;
import java.util.ArrayList;
// Program to demonstrate implementation of list interface by implementing the ArrayList class


public class ArrayList_P10 {
	public static void main(String[] args) {
		List l= new ArrayList();
		l.add("India");
		l.add(292);
		l.add(true);
		l.add('F');
		l.add(null);
		l.add(34.93);
		l.add("false");
		System.out.println("Element present in ArrayList l :"+ l);
		
		// get() : used to get the value at previous index 
		System.out.println("Value of index 5 : "+l.get(0));
		
	//set() : used to update elements in collection base on index
		l.set(1, "Be positive");
		System.out.println(l); // toString() is invoked
		
	//contains() : used to check the availability of provided element in the collection
		System.out.println("Nepal is available : "+ l.contains("Nepal"));
		System.out.println("India is available : "+ l.contains("India"));
		
	// converting collection of object into array
		Object obj[]= l.toArray();
		System.out.println("Element in array===>");
		for(int i=0; i<obj.length; i++)
		{
			System.out.println(obj[i]);
		}
	// Create another ArrayList collection
		List s= new ArrayList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(true);
		System.out.println("Element present in ArrayList s : "+s);
		
	// adding 2 different collection using addAll()
		s.addAll(l);
		System.out.println(s);
		
	// remove(Object obj) : for particular object from the collection
		s.remove(3);
		System.out.println(s);
	
	// remove(int index) : remove object from particular index
		s.remove(null);
		s.remove(0);
		System.out.println(s);
		
	// removeAll(collection c) : remove a complete collection which is present in another collection
		s.removeAll(l);
		System.out.println(s);
		
	// retainAll() :  pass argument will safe and other element will remove
		s.retainAll(l);
		System.out.println(l);
		
	//clear() : remove each and every element from the collection
		l.clear();
		System.out.println(l);
	
	// contains() :  used to check the availability of provided element in the collection
		System.out.println(l.contains(true));
	
	
	}
}