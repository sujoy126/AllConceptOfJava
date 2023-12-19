package com.scanner;

import java.util.Scanner;

// write a program even number b/w m & n 

public class P5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m,n;
		System.out.println("Start from m : ");
		m= sc.nextInt();
		System.out.println("upto n :");
		n= sc.nextInt();
		logicPart(m,n);
	}
 public static void logicPart(int a, int b)
 {
	 if(a>=0 && b>=0)
	 {
		 if(a<b)
		 {
			 for(int i=a+1; i<b; i++)
			 {
				 if(i%2==0)
					 System.out.println(i);
			 } 
		 }
		 else if(a>b)
		 {
			 for(int i=a-1; i>b; i--)
			 {
				 if(i%2==0)
					 System.out.println(i);
			 }
		 }
		 
	 }
	 else
	 {
		 System.out.println("please provide valid input");
	 }
 }
}
