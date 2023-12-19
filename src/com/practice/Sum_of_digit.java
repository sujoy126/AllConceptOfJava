package com.practice;

//Write a program to store a number and displaying the sum of its digit.

/* num=123456
sum numbers with reminder*/

public class Sum_of_digit {
	public static void main(String[] args) {
		int num = 123456;
		int rem;
		int sum= 0;
		do
		{
			rem = num%10;
			sum = sum+rem;
			num= num/10;
			
		}
		while(num!=0);
		System.out.println(sum);
		
	}

}  
