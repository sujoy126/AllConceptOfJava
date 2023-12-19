package com.array;

import java.util.Scanner;

public class Even_Odd_numbers {
	public static void main(String[] args) {
		int ary[] = new int[5];
	Scanner sc= new Scanner(System.in);
	int evencount=0,oddcount=0;
	System.out.println("Enter any numbers : ");
	 int count=0;
	for(int i=0; i<ary.length; i++)
	{
		ary[i] = sc.nextInt();
		if(ary[i]%2==0)
		{
			evencount++;
		}
		else
		{
			oddcount++;
		}
	}
	System.out.println("DIsplay even numbers : ");
	for(int j=0; j< ary.length; j++)
	{
		if(ary[j]%2==0)
		{
			System.out.println(ary[j]);
			
		}
	}
	System.out.println("NO of even numbers : "+ evencount);
	System.out.println("DIsplay odd numbers : ");
	for(int i=0; i<ary.length; i++)
	{
		if(ary[i]%2!=0)
		{
			System.out.println(ary[i]);
			
		}
	}
	System.out.println("No of odd numbers are : "+oddcount);
	
	
	
	
	
	}

}
