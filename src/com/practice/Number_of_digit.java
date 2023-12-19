package com.practice;

//write a program and find out how many digit are here"87654321"

public class Number_of_digit {
	public static void main(String[] args) {
		
	long num = 100000L, count =0;
	long digit;
	
	System.out.println("Number of digits from '87565432101' number");
	do 
	{
	    digit = num%10;
        count++;
	    num=num/10;
	    
	}
	while(num!=0);
	System.out.println(count);
	
	}
}
