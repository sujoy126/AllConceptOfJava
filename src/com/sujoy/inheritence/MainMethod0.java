package com.sujoy.inheritence;

class Father {
public void Govtjob() 
{
 System.out.println("You work in govt sector.");
}
}


 class Child1 extends Father{
	 @Override
public void Govtjob()
{
	System.out.println("I want to be a Softwear engineer.");
}
}
 
 
 class Child2 extends Father{
	  @Override
	 public void Govtjob()
	 {
		 System.out.println("I want to be a Teacher.");
	 }
}
 
 class MainMethod0{
	public static void main(String[]args)
	{
		 Child1 c1= new Child1();
		 Child2 c2= new Child2();
		 c1.Govtjob();
		 c2.Govtjob();
		 
		Father f = new Child1();
		f.Govtjob();
	}
 }