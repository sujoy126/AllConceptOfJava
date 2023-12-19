package com.interfaces;

public class ImC implements I2 {
	@Override
		public void m1() {
			System.out.println("m1 is from I1 interface.");
		}
	@Override
	public void m2() {
		System.out.println("m2 is from I2 interface.");
	}
}
