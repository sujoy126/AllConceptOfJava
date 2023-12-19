package com.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class IterationP8 {
	public static void iterate1(List<Integer>l)
	{
		System.out.println("Iterate using iterate() ");
		// create iterator for collection object
		// To get the coarser reference we have to call Iterator
		// it fetch the data one by one 
		Iterator<Integer> i= l.iterator();
		
		//Check element is present or not  by using hasNext() 
		while(i.hasNext())
		{
			// fetch the element by using next()
			Integer n =(Integer)i.next(); 
			System.out.println(n);
		}	
	}
	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(99);
		//marks.add("Hero"); // It is not allow due to Generic
		marks.add(90);
		marks.add(40);
		marks.add(50);
		marks.add(80);
		marks.add(82);
		iterate1(marks);
	}
	
	

}
