package com.Exception;

public class Program1 {
	public static void main(String[] args) {
		int a=20;
		int b=0;
		System.out.println("Main starts");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		try 
		{
		int c=a/b;
		System.out.println("value of c : "+c);
		}
		catch(Exception er)
		{
			System.err.println("Except zero all are acceptable. ");
		}
		
		System.out.println("Main Ends");	
	}

}
