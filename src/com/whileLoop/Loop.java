package com.whileLoop;

public class Loop {
	public static void main(String[] args) {
		int i=1;
		while(i<=4) {
			System.out.println("Iterate of i : "+i );
			int j=1;
			 while(j<=3) {
			System.out.println("interation of j "+j);
				j++;
			}
			i++;
			System.out.println("=============");
		}
		System.out.println("After Iteration : "+i);
		
	}
}
