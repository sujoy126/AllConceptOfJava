package com.Exception;

public class Array_Exception_Directly {
	public static void main(String[] args) {
		String name[]= {"Bihar", "Telengana", "West bengal", "Jharkhand"};
		System.out.println("State 1: "+ name[0]);
		System.out.println("State 2: "+ name[1]);
		System.out.println("State 3: "+ name[2]);
		System.out.println("State 4: "+ name[3]);
		try
		{
		System.out.println("State 5: "+ name[4]);
		}
		catch(Throwable tw)
		{
			System.err.println("Don't try to access value out of bound.");
		}
	}

}
