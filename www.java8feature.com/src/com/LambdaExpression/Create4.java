package com.LambdaExpression;

import java.util.stream.Stream;

public class Create4 {

	public static void main(String[] args) {

		Stream<Double> sm=Stream.generate(()->{return Math.random();});
		 sm.forEach(System.out::println);
	}

}
