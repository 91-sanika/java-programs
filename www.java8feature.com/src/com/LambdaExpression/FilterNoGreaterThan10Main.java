package com.LambdaExpression;

import java.util.function.Predicate;

public class FilterNoGreaterThan10Main {

	public static void main(String[] args) {
		
		int a[]= {4,3,18,10,34,23,78};
		
		Predicate<Integer> pob = (i)->i>10;
		Predicate<Integer> pob1= (i)->i>10;
		filterData(a,pob);
		filterData(a,pob1);
	}

	private static void filterData(int[] a, Predicate<Integer> pob) {
		System.out.println("no less than 10");
		for(int i:a) {
			if(pob.test(i)) {
				System.out.println(i);
			}
		}
		
	}
}
