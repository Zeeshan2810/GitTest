package com.java.programs;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		
		String str = "AABBFMMMGGDD";
		
		char[] arrayStr = str.toCharArray();

//1. Using sort() method	
		
		Arrays.sort(arrayStr);
		
		for(char ch: arrayStr) {
			
		System.out.print(ch);
		}



	}

}
