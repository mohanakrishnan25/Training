package com.interviewprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfWord {
public static void main(String[] args) {
	String s = "java is simple and java is easy";
	String[] sp= s.split(" ");
	Map<String, Integer> mp= new LinkedHashMap<>();
	for (String c : sp) {
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

