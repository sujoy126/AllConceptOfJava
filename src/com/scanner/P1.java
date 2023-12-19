// Write a program to check whether the given number is Even or odd

package com.scanner;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number to check whether it is Even or not :");
		num= sc.nextInt();
		
		enterValue(num);	
	}
	public static void enterValue(int n)
	{
		if(n!=0) 
		{
		 if(n%2==0)
			 System.out.println(n+" is Even number");
		 else
			 System.out.println(n+" is odd number");
	    }
		else
			System.out.println("Please provied valid input.");
	}

}
