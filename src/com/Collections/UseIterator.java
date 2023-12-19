package com.Collections;

import java.util.Iterator;
import java.util.Stack;

public class UseIterator {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.add(30);
		st.add(20);
		st.add(989);
		System.out.println(st);
		Iterator it = st.iterator();
		while(it.hasNext()==true)
		{
			int  i = (Integer)it.next();
			System.out.println(i);
		}
	}

}
