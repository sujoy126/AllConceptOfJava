package com.scanner;

import java.util.Scanner;

// write a program to print natural number from m to n

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		System.out.println("Provide first input : ");
		m= sc.nextInt();
		System.out.println("Provide end input : ");
		n=sc.nextInt();
		logicPart(m,n);
	}
   public static void logicPart(int a, int b)
   {
	   if(a>0 && b>0)
	   {
		   if(a<b)
		   {
			   for(int i=a; i<=b; i++)
			   {
				   System.out.println(i);
			   }
		   }
		   else if(a>b)
		   {
			   for(int i=a; i>=b; i--)
			   {
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
