package com.scanner;

import java.util.Scanner;

// write a program to odd number from m to n
public class P3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m,n;
		System.out.println("provide value of m : ");
		m=sc.nextInt();
		System.out.println("provide value of n : ");
		n= sc.nextInt();
		logicProvide(m,n);
	}
	public static void logicProvide(int m, int n)
	{
		System.out.println("All the odd number from "+m+" to "+n+" : ");
		if(m!=0 && n!=0)
		{
			if(m<n)
			{
				for(int i=m; i<=n; i++)
				{
					if(i%2!=0)
						System.out.println(i);
				}
			}
			else if(m>n)
			{
				for(int i=m; i>=n; i--)
				{
					if(i%2==1)
						System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("restriction for '0' ");
		}
	}
		

}
