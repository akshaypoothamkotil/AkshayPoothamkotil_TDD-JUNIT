package com.Function;

public class removingA {

	public String removeAFunction(String in)
	{
		String output="";
		
			if(in.charAt(0)!='A') {
				output+=in.charAt(0);
			}
			if(in.charAt(1)!='A') {
				output+=in.charAt(1);
			}
			output+=in.substring(2);
			
			
		return output;
	}
	
}
