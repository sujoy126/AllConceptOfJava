package com.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("JAVA");
		l1.add(21);
		l1.add('k');
		l1.add("in");
		l1.add("JAVA");
		System.out.println("L1 elements are : "+l1);
		Scanner sc= new Scanner(System.in);
		Boolean s = (Boolean)l1.contains("Pythan");
		System.out.println("Checking python element is there or not : "+s);
	}

}
