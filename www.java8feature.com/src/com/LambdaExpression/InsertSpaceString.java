package com.LambdaExpression;

import java.util.stream.Collectors;

public class InsertSpaceString {

	
   public static void main(String[] args) {
	  
		        String input = "CAPGEMINI";
		        String s= input.chars()
		        .mapToObj(c -> (char) c + " ")
		        .collect(Collectors.joining())
		        .trim();
		    
		    System.out.println(s);
		    System.out.println(s.length()); 
		    }

			}
