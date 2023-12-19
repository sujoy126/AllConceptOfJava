package com.StringC;

public class P2 {
	public static void main(String[] args) {
		String str = "ArrayXray";
		
		System.out.println("last index of :"+ str.lastIndexOf('y'));
		System.out.println("last index of :"+ str.lastIndexOf("ray"));
		System.out.println("last index of :"+ str.lastIndexOf(""));
		System.out.println("last index of :"+ str.lastIndexOf('r',3));
		System.out.println("last index of :"+ str.lastIndexOf("a", 5));
		System.out.println("last index of :"+ str.lastIndexOf("Z"));
		
		int s= str.lastIndexOf("a");
		System.out.println(s);
		
	}

}
