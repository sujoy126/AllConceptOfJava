package com.scanner;

import java.util.Scanner;


public class Smallest_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ary[]= new int[5];
		System.out.println("enter integer value : ");
		int n= ary.length;
		for(int i=0; i<n; i++)
		{
			ary[i]= sc.nextInt();
     	}
		int smallest = ary[0];
		for(int i=0; i<n; i++)
		{
			if(smallest>ary[i])
			{
				smallest= ary[i];
			}
		}
		System.out.println("Smallest number is : "+ smallest);
	}
}
