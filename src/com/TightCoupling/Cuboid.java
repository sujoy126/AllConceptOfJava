package com.TightCoupling;

public class Cuboid {
    int volume;
	int length;
	int width;
	int height;
	Cuboid(int length, int width, int height)
	{
		this.volume= length*width*height;
	}
}
