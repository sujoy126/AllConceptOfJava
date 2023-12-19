package com.Map;
import java.util.Map;
import java.util.HashMap;

public class P1 {

	public static void main(String[] args) {
		Map m1= new HashMap();
		m1.put(101, "INDIA");
		m1.put(102, "Telengana");
		m1.put(103,"A.P");
		m1.put(104, "Kerala");
		System.out.println(m1);
		
		Map m2= new HashMap();
		  m2.put(m1, m2);
		

	}

}
