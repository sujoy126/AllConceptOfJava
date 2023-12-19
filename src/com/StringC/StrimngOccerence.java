package com.StringC;

public class StrimngOccerence {
	public static void main(String[] args) {
		String str = "AutomatinTesting";
		 String st = str.toLowerCase();
		 
		char ch[] = st.toCharArray();
	//	System.out.println(ch);
		
		for(int i=0; i<ch.length; i++) {
			int count=0;
			for(int j=0; j<ch.length; j++) {
				
				if(ch[i]==ch[j] && i>j) {
					break;
				}
				if(ch[i]==ch[j]) {
					count++;
				}	
			}
			if(count>0) {
				System.out.println(ch[i]+" of accourence "+ count);
			}
		}
		
		
	}

}
