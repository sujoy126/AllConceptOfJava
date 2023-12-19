package com.array;

import java.util.Scanner;

public class Even_numberss {
	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 different numbers : ");
		for(int i=0; i<num.length; i++)
		{
			num[i]= sc.nextInt();
		}
		System.out.println("Even numbers");
		for(int j=0; j<num.length; j++)
		{
			if(num[j]%2==0)
			{
				System.out.println(num[j]);
			}
		}
	}

}
