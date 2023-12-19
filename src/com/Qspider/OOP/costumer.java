package com.Qspider.OOP;
class RBI{
public double returns()
{
	return 5.0;
}
}

class Icici extends RBI{
	@Override
public double returns()
{
   return 6.3;
}
}

class SBI extends RBI{
	@Override
public double returns()
{
    return 5.8;		
}
}

 class costumer {
public static void main(String[]args)
{
	SBI s1=new SBI(); 
	double returns=s1.returns();
	System.out.println("Returns from SBI : "+returns);
	
	Icici i1= new Icici();
	returns= i1.returns();
    System.out.println("Returns form ICICI : "+returns);
    
    
}
}
