package com.TightCoupling;

public class Volume {
	public static void main(String[] args) {
		Cuboid cu= new Cuboid(10,20,30);
		int v=cu.volume;
		System.out.println("Cuboid volume is : "+v);
	}

}
