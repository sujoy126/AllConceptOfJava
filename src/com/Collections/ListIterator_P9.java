package com.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

// Program to demonstrate for ListIterator

public class ListIterator_P9 {
	public static void iterate1(List<Integer> value)
	{
		System.out.println("ListIterator using listIterator()");
		ListIterator li =value.listIterator();
		
		System.out.println("Traversing forword");
		while(li.hasNext())
		{
			Integer x= (Integer)li.next();
			System.out.println(x);
		}
		
		System.out.println("Travesing backword");
		while(li.hasPrevious())
		{
			Integer y = (Integer)li.previous();
			System.out.println(y);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> marks= new ArrayList<Integer>();
		marks.add(100);
		marks.add(89);
		marks.add(49);
		marks.add(76);
		marks.add(68);
		marks.add(90);
		marks.add(88);
		iterate1(marks);		
	}
}
