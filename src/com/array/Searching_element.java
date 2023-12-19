package com.array;

public class Searching_element {
	public static void main(String[] args) {
		  
		int ary[]= {10,20,50,32,90};
		int key=1000;
		int count=0;
		for(int i=0; i<ary.length; i++)
		{
			if(key==ary[i])
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(key+" element is found.");
		}
		else 
		{
			System.out.println(key+" element is not available");
		}
	}

}
