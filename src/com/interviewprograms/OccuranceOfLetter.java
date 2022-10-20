package com.interviewprograms;


import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfLetter {
public static void main(String[] args) {
	String s = "Greens";
	Map<Character, Integer> mp= new LinkedHashMap<>();
	for (int i = 0; i < s.length(); i++) {
		char c=s.charAt(i);
		if(mp.containsKey(c)) {
			Integer count= mp.get(c);
			mp.put(c, count+1);
		}
		else {
			mp.put(c, 1);
		}
	}
	System.out.println(mp);		
}
}