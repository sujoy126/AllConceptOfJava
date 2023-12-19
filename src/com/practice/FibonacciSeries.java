package com.practice;
//Write a program to given series "0 1 1 2 3 5 8 13 21 34 "
public class FibonacciSeries {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int sum;
		System.out.print(n1+" "+n2);
		for(int i=2; i<10; i++) {
			sum = n1+n2;
			n1 = n2;
			n2 = sum;
			System.out.print(" "+sum+" ");
		}
		
		
	}

}
