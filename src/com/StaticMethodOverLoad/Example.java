package com.StaticMethodOverLoad;
class Example {
    // Static method with one parameter
    static void display(int a) {
        System.out.println("Argument: " + a);
    }

    // Static method with two parameters
    static void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // Static method with a different type parameter
    static void display(String a) {
        System.out.println("Argument: " + a);
    }

    public static void main(String[] args) {
        // Calling the overloaded static methods
        Example.display(10);            // Outputs: Argument: 10
        Example.display(10, 20);        // Outputs: Arguments: 10 and 20
        Example.display("Hello");       // Outputs: Argument: Hello
    }
    
    
}