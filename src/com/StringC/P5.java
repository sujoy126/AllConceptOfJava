package com.StringC;

public class P5 {
	public static void main(String[] args) {
		String str = "1234567890"; 
		System.out.println("Before hiding the charactor : \n"+str);
		String p=  str.replace("123456", "******");
		System.out.println("After replacing the charactor : \n"+p);
		
	}

}
