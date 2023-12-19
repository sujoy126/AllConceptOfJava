package com.scanner;

import java.util.Scanner;
// write a program to print natural number b/w m & n

public class P7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("First input of a: ");
		a= sc.nextInt();
		System.out.println("End input of b: ");
		b= sc.nextInt();
		logicPart(a,b);
	}
 public static void logicPart(int m, int n)
 {
	 if(m!=n)
	 {
	 if(m>0 && n>0)
	 {
		 if(m<n)
		 {
			 for(int i=m; i<=n; i++)
			 {
				 System.out.println(i);
			 }
		 }
		 else if (m>n)
		 {
			 for(int i=m; i>=n; i--)
			 {
				 System.out.println(i);
			 }
		 }
		 
	 }
	}
	 else
	 {
		 System.out.println("Please provide valid natural number.");
	 }
 }

}
