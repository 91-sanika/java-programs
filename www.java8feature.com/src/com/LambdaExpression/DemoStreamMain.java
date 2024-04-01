package com.LambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreamMain {

		public static void main(String[] args) {
			List<Integer> lst = new ArrayList<Integer>();
			List<Integer> lst1=new ArrayList<Integer>();
			for(int i=1;i<=10;i++){
				lst.add(i);
			}
			
			//filter elements greater than 5
			for(int i:lst) {
				if(i>5) {
					lst1.add(i);
				}
			}
			System.out.println(lst1);
			
			//Using stream api
			
			//convert list to stream
			
			Stream<Integer> stm=lst.stream();
			//apply now Lamda expression to filter no greater than 5
			
		List<Integer> list2=stm.filter(n->n>5).collect(Collectors.toList());
		Stream<Integer> stm1=lst.stream();
		List<Integer> list3=stm1.filter(n->n<5).collect(Collectors.toList());
		
		
		System.out.println(list2);
		System.out.println(list3);
		}
}
// filter only even no
	/*	List<Integer> list = new ArrayList<Integer>();
		List<Integer>list4 = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		for(int i:list) {
			if(i%2===0) {
				list4.add(i);
			}
		}
		System.out.println(list4);
	}
//using stream
Stream<Integer>sm = lst.stream();
list4=sm.filter(num->num%2==0).collect(collectors.tolist());
System.out.println(list4);
 */