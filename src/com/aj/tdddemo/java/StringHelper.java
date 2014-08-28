package com.aj.tdddemo.java;

public class StringHelper {

	

	public String processString(String str) {
		if(str.length()<2)return str;
		
		char first=str.charAt(0);
		char last=str.charAt(1);
		
		return ""+last+first;
		
		
	}

}
