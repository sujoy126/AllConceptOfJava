package com.scanner;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		String Name;
		int Age;
		String BloodGroup;
		long MobileNo;
		String Course;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your name :");
		Name=sc.nextLine();
		System.out.println("Enter your course :");
		Course= sc.nextLine();
		System.out.println("Give Blood details:");
		BloodGroup= sc.nextLine();
		System.out.println("Enter your age :");
		Age= sc.nextInt();
		System.out.println("Please enter your mobile number :");
		MobileNo = sc.nextLong();
		System.out.println("------------");
		System.out.println("Display student details");
		System.out.println("Name of student: "+Name);
		System.out.println("Name of the course "+ Course);
		System.out.println("Blood group : "+ BloodGroup);
		System.out.println("Age : "+ Age);
		System.out.println("MObile no : "+ MobileNo);
		
		
		
		
		
		
		
	}

}
