package com.java.programs;

public class CheckVowelsInString {

	public static void main(String[] args) {
		
		int count = 0;
		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		String str = "GeeksforGeeks";
				
		char[] arraystr = str.toCharArray();
		
		for(int i = 0; i < arraystr.length ; i++) {
			
			for(int j = 0 ; j < vowels.length; j++) {
				
				if(arraystr[i]==vowels[j]) {
					count++;
					
					System.out.println("Given string contains vowels: "+vowels[j]);
					
				}
				
				
			}
			
			
		}
		System.out.println("Number of Vowels in a string: "+count);
		
	}

}
