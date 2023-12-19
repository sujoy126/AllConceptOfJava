package com.Exercise;

import java.util.List;
import java .util.ArrayList;

public class P1 {
	public static List display(List value)
	{
		return value;
	}
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Tiger");
		l.add(100);
		l.add("west bengal");
		l.add(99.9);
		System.out.println( display(l));
	}

}
