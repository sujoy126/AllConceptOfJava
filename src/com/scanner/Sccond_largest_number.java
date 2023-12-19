package com.scanner;

import java.util.Scanner;

public class Sccond_largest_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ary[]= new int[5];
		System.out.println("enter integer value : ");
		int n= ary.length;
		for(int i=0; i<n; i++)
		{
			ary[i]= sc.nextInt();
	    }
		int greatest= ary[0];
		int secondGN=ary[0];
		for(int j: ary)
		{
			if(j>greatest)
			{	
				secondGN= greatest;
				greatest= j;	   
			}
			else if(j>secondGN && j<greatest)
			{
				secondGN =j;
			}
		}
		System.out.println("Second largest number: "+secondGN);
		
		
	}
}
