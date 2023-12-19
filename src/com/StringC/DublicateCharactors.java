package com.StringC;

public class DublicateCharactors {
	public static void main(String[] args) {
		String str = new String("testingAutomation");
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch1 = str.charAt(i);
			if(ch1=='t') {
				count++;
			}
		}
		System.out.println( "T has total number of dubicate charactors: "+count);
	}

}
