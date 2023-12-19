package com.scanner;

import java.util.Scanner;
// Write a program to print odd number b/w m & n.

public class P6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		System.out.println("Value Entry gate : ");
		m=sc.nextInt();
		System.out.println("Value exit  gate : ");
		n= sc.nextInt();
		
		if(m>0 && n>0)
		{
			if(m<n)
			{
				for(int i=m+1; i<=n-1; i++)
				{
					if(i%2==1)
						System.out.println(i);
				}
			}
			else if(m>n)
			{
				for(int i=m-1; i>n+1; i++)
				{
					if(i%2!=0)
						System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("provide valid input");
		}
	}

}
