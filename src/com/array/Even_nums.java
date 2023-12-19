package com.array;

import java.util.Scanner;

public class Even_nums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int[5];
		System.out.println("Enter numbers : ");
		
		int l= ar.length;
		for(int i=0; i<l; i++)
		{
		   ar[i] = sc.nextInt();
		}
		System.out.println("Displayed even numbers");
		for(int i=0; i<l; i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
	}

}
