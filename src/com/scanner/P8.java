package com.scanner;

import java.util.Scanner;
// Write a program to count both even and odd number b/w m to n. 

public class P8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Input first  :");
		a=sc.nextInt();
		System.out.println("Input last  : ");
		b= sc.nextInt();
		
		int count=0;
		if(a!=0 && b!=0)
		{
			for(int i=a;i<=b;i++)
			{
				
				if(a<b)
				{
					int rem =i%2;
					if(rem==0)
						{
							if(i!=0)
							{
								System.out.println(i);
								count++;
								System.out.println(count);
							}	
						}	
				}
				if(a>b)
				{
					int rem =i%2;
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
			
		}
		
	}

}
