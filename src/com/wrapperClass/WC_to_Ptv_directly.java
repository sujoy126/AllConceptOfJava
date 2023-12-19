package com.wrapperClass;

public class WC_to_Ptv_directly {
	public static void main(String[] args) {
		Integer i= 43;
		
		int r = i;
		System.out.println("Integer Wrapper class object in int type : "+r);
		
	//	Long lo= (Long)i;
	//	System.out.println(lo);
		
		
		
		
		
		
		//byte by= i;
		//System.out.println("Integer Wrapper class object in int type : "+by);
		float fl= i;
		System.out.println("Integer Wrapper class object in float type : "+fl);
	//	byte be= i;
  //    System.out.println(be);
	//	short sh= i;
	//	System.out.println(sh);
		long lo= i;
		System.out.println(lo);
		double de= i;
		System.out.println(de);
		
	
		
		Byte b1= 12;
		
		byte b2= b1;
		System.out.println("BYte Wrapper class object in byte type :"+ b2 );
		short s1= b1;
		System.out.println("BYte Wrapper class object in Short type : "+s1);
		long l1= b1;
		System.out.println("BYte Wrapper class object in long type : "+ l1);
		int i1= b1;
		System.out.println("BYte Wrapper class object in int type : "+ i1);
	//	boolean bo = b1;
	//	System.out.println(bo);
	//	char c1=b1;
	//	System.out.println(c1);
		
		double d1= b1;
		System.out.println("BYte Wrapper class object in double type : "+d1);
		float f1= b1;
		System.out.println("BYte Wrapper class object in float type : "+f1);
		
	}

}
