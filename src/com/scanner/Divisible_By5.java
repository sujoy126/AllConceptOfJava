package com.scanner;

import java.util.Scanner;

public class Divisible_By5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value : ");
		int i =  sc.nextInt();
		if(i%5==0 && i!=0)
		{
			System.out.println(i+" is divisible by 5.");
		}
		else 
		{
			System.out.println(i+" is not divisible by 5.");
		}
	}

}
