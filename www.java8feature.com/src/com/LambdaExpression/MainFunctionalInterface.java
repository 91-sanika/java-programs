package com.LambdaExpression;

import java.util.function.Function;

public class MainFunctionalInterface {

	public static void main(String[] args) {
		
		Function<String,Integer> fob =(s)->s.length();
       
System.out.println(" length of string Edubridge = "+fob.apply("Edubridge"));


	}

}
