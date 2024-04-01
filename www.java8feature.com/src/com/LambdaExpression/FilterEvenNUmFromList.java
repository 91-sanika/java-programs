package com.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterEvenNUmFromList {

	public static void main(String[] args) {
		
List<Integer>lst = new ArrayList<Integer>();

lst.add(89);
lst.add(65);
lst.add(32);
lst.add(45);

lst
.stream()
.filter(n->n%2==0)
.forEach(n->System.out.println(n));

Stream<Integer>sm1=lst.stream();
Integer a[]= sm1.filter(n->n%2!=0).toArray(Integer[]::new);
System.out.println("All odd no");
for(int i:a) {
	System.out.println(i);
}

Stream<Integer>s1=Stream.of(7,9,3,4,5);
String arr[]={"Manoj","Kiran","ravi"};
Stream<String>s6 = Stream.of(arr);
s6.filter(name->name.length()>4).map(name->name.toUpperCase()).sorted()
.forEach(n->System.out.println(n));

}

	
}
