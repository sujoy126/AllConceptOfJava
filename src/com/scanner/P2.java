package com.scanner;

import java.util.Scanner;

// Write a program to print even number from m to n

public class P2 {
	public static void main(String[] args) {
		int m,n;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter value of m :");
		 m=sc.nextInt();
		 System.out.println("Enter value of n :");
		 n=sc.nextInt();
		 logicPart(m,n);
	}
	public static void logicPart(int r, int s)
	{
		System.out.println("all the even number from "+r + " to "+s);
		
		if(r!=0 && s!=0)
	{
		if(r<s)
		{
		for(int i=r; i<=s; i++)
		{
			int rem=i%2;
			if(rem==0)
			{
				if(i!=0)
				{
				System.out.println(i);
				}
			}
		}
		}
		else if (r>s)
		{
			for(int i=r; i>=s;i--)
			{
				int rem=i%2;
				if(rem==0)
				{
					if(i!=0)
					{
					System.out.println(i);
					}
					
				}
					
			}		
		}
	}
		else
		{
			System.out.println("please provide valid input");
		}
	  }
}
