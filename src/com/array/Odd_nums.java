package com.array;

import java.util.Scanner;

public class Odd_nums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num [] = new int[5];
		
		System.out.println("Please provide numbers : ");
		for(int i=0; i<num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.println("Stored odd numbers displayed");
		{
			for(int i=0; i<num.length; i++)
			{
				if(num[i]%2==1)
				{
					System.out.println(num[i]);
				}
			}
		}
		
	}

}
