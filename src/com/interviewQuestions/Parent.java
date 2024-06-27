package com.interviewQuestions;

public class Parent {

	public static void show() {
		System.out.println("Static method in Parent");
	}
}

class Child extends Parent {
	public static void show() {
		System.out.println("Static method in Child");
	}
}

class MainClass {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Parent child = new Child();

		parent.show(); // Outputs: Static method in Parent
		child.show(); // Outputs: Static method in Parent

		Child realChild = new Child();
		realChild.show(); // Outputs: Static method in Child
	}
}
