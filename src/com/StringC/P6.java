package com.StringC;

public class P6 {
	public static void main(String[] args) {
		String sr = "The all time favorite snakes";
		String[] s = sr.split(" ");
		int count=0;
		for(String p: s) 
		{
		//	System.out.println(p);
			count++;
		}
		System.out.println("no of Words are : "+count);
	}

}
