package com.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CMethods {
	public static void main(String[] args) {
		List al = new ArrayList();
		System.out.println("Before adding element in arraylist al"+al);
        al.add(20);
        al.add(20);
        al.add(true);
        al.add("S");
        System.out.println("after adding element in arraylist al \n"+al);
           
        List al2= new LinkedList();
        System.out.println("Before adding arraylist al2 \n"+al2);
        al2.add(188);
        al2.add('r');
        al2.add(34.555);
        al2.add("Amazon");
        System.out.println("after adding  al element in arrylist al2 \n"+al2);
        
         al.addAll(al2);
        System.out.println("after adding  al element in arrylist al2 \n"+al);
        
        al.remove(1);
        System.out.println(al);
        
        
        
        
	}

}
