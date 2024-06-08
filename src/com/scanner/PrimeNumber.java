package com.scanner;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("provide number");
		int num = sc.nextInt();
		if(num==0 || num ==1) {
			System.out.println(num+" is not a prime number");
			return;
		}
		for(int i=2; i*i<=num; i++) {
			if(num%i==0) {
				System.out.println(num+" is not a prime number");
				return;
			}
		}
		System.out.println(num+" is a prime number");
	}

}
