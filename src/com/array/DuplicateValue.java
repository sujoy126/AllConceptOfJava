package com.array;

public class DuplicateValue {
	public static void main(String[] args) {
		
		int ary[] = {10,20, 20, 40, 50, 50, 50};
		
		for(int i=0; i<ary.length; i++) {
			int count =0;
			for(int j=0; j<ary.length; j++) {
				if(ary[i]==ary[j] && i>j) {
					break;
				}
				if(ary[i]==ary[j]) {
					count++;
				}
				
			}
			if(count>0) {
				System.out.println(ary[i]+" "+count);
			}
		}
		
	}

}
