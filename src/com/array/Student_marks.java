package com.array;

import java.util.Scanner;

public class Student_marks {
	public static void main(String[] args) {
		int marks[]= new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks scored in 5 subjects");
		for(int i=0; i<marks.length; i++)
		{
			marks[i] = sc.nextInt();
		}		
	}

}
