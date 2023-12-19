package com.StringC;

public class TestString {
public static void main(String[] args) {
	String obj = new String("core");
	System.out.println("Before operation data is: "+obj);
	System.out.println(obj+" java");
	System.out.println("After operation data is: "+obj);
	
	System.out.println("--------------");
	//mutable version of String: StringBuffer & StringBuilder
	StringBuffer sb = new StringBuffer("core");
	System.out.println("Before operation data is: "+sb);
	System.out.println(sb.append(" java"));
	System.out.println("After operation data is: "+sb);
	
	
	System.out.println("--------------");
	StringBuilder b = new StringBuilder("core");
	System.out.println("Before operation data is: "+b);
	System.out.println(b.append(" java"));
	System.out.println("After operation data is: "+b);
	P2 p = new P2();
	P2 o = new P2();
	System.out.println(o.hashCode());
	System.out.println(p.hashCode());
	//hashCode and hashCode()
}
}
