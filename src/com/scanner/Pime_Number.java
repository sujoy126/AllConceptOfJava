package com.scanner;

import java.util.Scanner;

public class Pime_Number {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter number : ");
		int t = sc.nextInt();
		
		int count=0;
		for(int j=1; j<=t; j++)
		{
			if(t%j==0)
			{
				count++;	
			}
		}
			 if(count==2)
				System.out.println(t+" is a prime number.");
			 else 
			 {
				 System.out.println(t+" is not a prime number");
			 }
					
	}

}
