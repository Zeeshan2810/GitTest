package com.java.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		String names[] = {"Java", "JavaScript", "C", "Java", "Python", "Ruby", "Python", "Python"};
		
		Map<String,Integer> lang = new HashMap<String, Integer>();
		
		for(String name : names){
			Integer count = lang.get(name);
			if(count== null){
				
				lang.put(name, 1);
			}
			else{
				
				lang.put(name, ++count);
				
			}
		}
		
		for(Entry<String, Integer> entry : lang.entrySet()){
			
			if(entry.getValue()>1){
				
				System.out.println("Duplicate element in the Array is: "+entry.getKey()+ " And Number of Occurences: "+entry.getValue());
				
			}
		}

	}

}
