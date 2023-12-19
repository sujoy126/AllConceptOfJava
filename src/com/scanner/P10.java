package com.scanner;

import java.util.Scanner;

// Write a program to print smallest of two number.
public class P10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("First input :");
		a= sc.nextInt();
		System.out.println("Second input :");
		b= sc.nextInt();
		logicPart(a,b);
	}
	public static void logicPart(int m,int n)
	{
		if(m!=n)
		{
			if(m<n)
				System.out.println(m+ " is the smallest number");
			else if(m>n)
				System.out.println(n+ " is the smallest number");
		}
		else
		{
			System.out.println("Please provide different input");
			
		}
		
	}

}
