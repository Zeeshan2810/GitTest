package com.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concat2StringsAndReverseIt {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String S1: ");
		String s1 = br.readLine();
		
		System.out.println("Enter S2 String: ");
		String s2 = br.readLine();
		
		Solution ob = new Solution();
		String revCon = ob.conRevString(s1,s2);
		
		System.out.println("Final String after reverse and concatination: " +revCon);

	}

}

class Solution{
	
	public String conRevString(String s1, String s2) {
		
		//String s3 = s1.concat(S2);
		String s3 = s1+s2;
		String rev = "";
		
		for (int i = s3.length()-1 ; i>=0 ; i--) {
			rev = rev + s3.charAt(i);
			
		}
				
		return rev;
		
		
	}
	
	
}