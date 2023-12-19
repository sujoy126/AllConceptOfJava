package com.scanner;

import java.util.Scanner;

public class Greatest_number {
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
		for(int i=0; i<n; i++)
		{
			if(ary[i]>greatest)
			{
				greatest= ary[i];
			}
		}
		
		System.out.println("greatest number among these : "+ greatest);
	}

}
