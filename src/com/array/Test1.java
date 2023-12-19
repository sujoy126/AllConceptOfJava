package com.array;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter values : ");
		int ary[] = new int [5];
		
		for(int i=0; i<ary.length; i++)
		{
		   ary[i] = sc.nextInt();
		}
		
		System.out.println("stored value displayed : ");
		
		for(int i=0; i<ary.length; i++)
		{
			System.out.println(ary[i]);
		}
	}

}
