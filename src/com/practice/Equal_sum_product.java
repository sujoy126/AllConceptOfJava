package com.practice;


/* Write a program to store a number and check whether the sum of the digit and 
product of the digit are equal.*/ 

//num=123,reminder,sum, product, if else;
public class Equal_sum_product {
	public static void main(String[] args) {
		int num = 123;
		int rem;
		int sum=0;
		int secondNum = num;
		int product =1;
		int original = num;
		
		do
		{
			rem = num%10;
			sum = sum+rem;
			num = num/10;	
		}
		while(num!=0);
		
		do
		{
			rem= secondNum%10;
			product = product*rem;
			secondNum = secondNum/10;	
		}
		while(secondNum!=0);
		if(sum==product)
		{
			System.out.println(original+ " this is Pronic number");
		}
		else 
		{
			System.out.println(original+ " this is not a pronic number ");
		}
	}

}
