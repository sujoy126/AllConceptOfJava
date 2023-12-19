package com.Specilization;

public class MainClass {
	public static void main(String[] args) {
		Universe uv= new Earth();
		Earth e= (Earth)uv;
		e.expends();
		e.increase();
	}


}
