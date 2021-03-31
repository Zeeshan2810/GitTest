package com.java.programs;

import java.util.Scanner;

public class NumberOfWordsInString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//String s = "My Name is Zeeshan";
		
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();	
		String words[] = s.split(" ");
		
		System.out.println("Number of words in a given string are: "+words.length);
	

	}

}
