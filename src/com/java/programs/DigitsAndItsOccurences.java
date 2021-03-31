package com.java.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DigitsAndItsOccurences {

	public static void main(String[] args) {
		
		int[] num = {2,6,8,9,4,2,1,8,1,3,6,10,12,10,4,5,11,11,11};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(Integer n : num) {
			Integer count = map.get(n);
			if(count==null)
				map.put(n, 1);
			else
				map.put(n,++count);
			
		}
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>=1)
				System.out.println("Digits:"+entry.getKey()+" and its occurs:"+entry.getValue());
		}

	}

}
