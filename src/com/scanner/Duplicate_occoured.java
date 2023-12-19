package com.scanner;

public class Duplicate_occoured {
	public static void main(String[] args) {
		
	//	String ary[]= {"as as as "};
	 	int ary[]= {10,20,30,40,20,50,20,40,40,90};

		for(int i=0; i<ary.length; i++)
		{
			int count=0;
			for(int j=0; j<ary.length; j++)
			{
				if(ary[i]==ary[j] && i>j)
				{
						break;
				}
				if(ary[i]== ary[j])
				{
					count++;
				}		
			}
			if(count>0)
			{
				System.out.println(ary[i]+ " occoured "+ count +" times.");
				
			}
		}
		
		
		
	}

}
