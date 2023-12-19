package com.scanner;

import java.util.Scanner;

public class Duplicate_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int ary[]= new int[6];
		for(int i=0; i<ary.length; i++)
		{
			 ary[i]= sc.nextInt();
		}
		int count=0;
		
		for(int i=0; i<ary.length; i++)
		{
			for(int j=0; j<ary.length; j++)
			{
				if(ary[i]==ary[j] && i>j)
				{
					break;
				}
				if(ary[i]==ary[j])
				{
					System.out.println(ary[j]);
					count++;
				}
			}
		}
		System.out.println("no of duplicate element present : "+count);	
	}

}
