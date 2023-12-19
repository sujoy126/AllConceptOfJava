package com.Collections;
import java.util.List;
import java.util.ArrayList;

public class P2 {
	public static void main(String[] args) {
		List l= new ArrayList();
		l.add(100);
		l.add("Hyabusa");
		l.add(99.99);
		l.add(true);
		if(l.isEmpty()==true)
		{
			System.out.println("Collection is Empty");
		}
		else
		{
			System.out.println("Collection is not Empty");	
			System.out.println("Elment in collection are :"+l);
		}
		System.out.println("Element before remove() : "+l);
		l.remove(1);
		System.out.println("Element after remove() : "+l);
		
	}

}
