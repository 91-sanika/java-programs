package com.LambdaExpression;

import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {
		
		Integer[]arr={8,9,10,11,12,13,14,15,16};
		
		Predicate<Integer>all,evens,odd;
		
		all=(n)->true;
		odd=(n)->n%2!=0;
		evens=(n)->n%2!=0;
		evens=(n)->n%2==0;
		System.out.println("\n All numbers:");
		display(all,arr);
		System.out.println("\n All Even numbers:");
		display(evens,arr);
	}

	private static void display(Predicate<Integer> all, Integer[] arr) {
		for(Integer i:arr) {
			Predicate<Integer> p = null;
			if(p.test(i))System.out.println(i+"");
		}
		
	}

}
