package com.scanner;

import java.util.Scanner;

public class CheckElement {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the no. of element to store : ");
	    int noOfEliments = sc.nextInt();
	   
	    
	    int ary[]= new int[noOfEliments];
	    System.out.println("enter eliments into array : ");
	    for(int i=0; i<ary.length; i++)
	    {
	       ary[i] = sc.nextInt();
	    }
	    
	    
	    System.out.println("Enter a key to be searched in array : ");
	    int key = sc.nextInt();
	    int count=0;
	    for(int i=0; i<ary.length; i++)
	    {
	    	if(ary[i]==key)
	    	{
	    		count++;
	    		break;
	    	}
	    }
	    if(count>0)
	    {
	    	System.out.println("Element is found");
	    }
	    else
	    {
	    	System.out.println("Element is not found");
	    }
	}

}
