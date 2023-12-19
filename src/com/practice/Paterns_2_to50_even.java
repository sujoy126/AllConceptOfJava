package com.practice;

public class Paterns_2_to50_even {
	public static void main(String[] args) {
		int n= 5;
		int m=2;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
					System.out.print(m+" ");
					m= m+2;
			}
			System.out.println();
		}
	}

}
