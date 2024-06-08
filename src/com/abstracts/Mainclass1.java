/*WAP for below requirment
 Super class contatin 2 abstract method
 Complete the incomplete method in the sub class*/

package com.abstracts;

abstract class Work
{
	public abstract void startWork();
	public abstract void stopWork();
}
class Workmen extends Work
{
	@Override
	public void startWork()
	{
		System.out.println("Work started");
	}
	@Override
	public void stopWork()
	{
		System.out.println("Work stoped");
	}
}


public class Mainclass1 {
	public static void main(String[]args) {
		Work w1= new Workmen();
		w1.startWork();
		w1.stopWork();
	}
}
