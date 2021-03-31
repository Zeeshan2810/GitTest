package com.java.programs;

import java.util.Scanner;

public class CountCharacterOccurence {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("Enter a char to know its occurences in the given string: \n");
		char ch = sc.next().charAt(0);
		String ch1 = Character.toString(ch); 
		
		String s1 = s.replace(ch1, "");
		
		int count = s.length()-s1.length();
		
		System.out.println("Number of Occurence of character "+ch+" in the string "+s+" is: "+count);
		
	}

}
