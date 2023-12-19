package com.inheritance.multiLevel;

public class C extends B{
	int n=100;
	public void m3()
	{
		m1();
		System.out.println("parent class has double poperty "+d);
		System.out.println("m3 is child class property. "+n);
	}

}
