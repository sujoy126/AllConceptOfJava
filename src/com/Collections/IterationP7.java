package com.Collections;
// Iterate throw element using for or for-each loop
import java.util.LinkedList;

public class IterationP7 {
	public static void iterate1(LinkedList v)
	{
		System.out.println("Literate throw element using 'for' loop. ");
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.get(i));
		}
	}
	public static void iterate2(LinkedList v)
	{
		System.out.println("Iterate throw element using 'for-each' loop ");
		for(Object r: v)
		{
			System.out.println(r);
		}
	}
	public static void pause() throws InterruptedException
	{		
		Thread.sleep(5000);
	}
	
	
	public static void main(String[] args) throws InterruptedException{
		LinkedList l= new LinkedList();
		l.add("JAVA");
		l.add('K');
		l.add(44.40);
		l.add(true);
		
		System.out.println("Work Started");
		pause();
		iterate1(l);
		pause();
		iterate2(l);
		pause();
		System.out.println("Work is done");
	}

}
