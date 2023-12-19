package com.Exception;

public class Array_exception_New_KeyWord {
	public static void main(String[] args) {
		int num[]= new int[5];
		num[0]='A';
		num[1]=100;
		num[2]=200;
		num[3]=300;
		num[4]='B';		
		System.out.println("Value of 1st contaner : "+ num[0]);
		System.out.println("Value of 2st contaner : "+ num[1]);
		System.out.println("Value of 3st contaner : "+ num[2]);
		System.out.println("Value of 4st contaner : "+ num[3]);
		System.out.println("Value of 5st contaner : "+ num[4]);
		try
		{
		num[5]=500;
		//System.out.println("Value of 6st contaner : "+ num[5]);
		}
		catch(Throwable tw)
		{
			System.err.println("Don't try to access out of bound.");
		}
		
	}

}
