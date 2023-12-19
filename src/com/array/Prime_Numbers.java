package com.array;

import java.util.Scanner;

public class Prime_Numbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter number : ");
		int [] prim= new int [5];
		int last=prim.length;
		
		for(int i=0; i<last; i++)
		{
		prim[i]= sc.nextInt();
		}
		
		int count=0;
		int j;
		for(  j=0; j<last; j++)
		{	
			for(int k =1; k<=last;k++)
			{
			 if(prim[j]%k==0)
			 {
				count++;	
			 }
			} 
		}
		
			 if(count==2)
				System.out.println(prim[j]+ " is prime");
		
	}

}
