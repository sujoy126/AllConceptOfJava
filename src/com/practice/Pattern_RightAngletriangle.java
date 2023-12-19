package com.practice;
/*
 * 1
   1 1
   1 1 1
   1 1 1 1
   1 1 1 1 1
 * */

public class Pattern_RightAngletriangle {
	public static void main(String[] args) {
		int m= 1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
