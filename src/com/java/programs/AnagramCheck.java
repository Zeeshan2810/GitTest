package com.java.programs;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		
		System.out.println("Enter first string: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("Enter Second string: ");
		String str2 = sc.nextLine();
		sc.close();
		anagramchk(str1,str2);

	}
	
	static void anagramchk(String s1,String s2) {
		
		if(s1.length()!=s2.length())
			System.out.println("Strings are not anagram");
		else 
		{
			char[] arrays1 = s1.toCharArray();
			char[] arrays2 = s2.toCharArray();
			
			Arrays.sort(arrays1);
			Arrays.sort(arrays2);
			
			boolean flag = Arrays.equals(arrays1, arrays2);
			if(flag)
				System.out.println("Strings are Anagram");
			else
				System.out.println("Strings are not anagram!!!");
			
		}
		
		
		
		
	}

}
