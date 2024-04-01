package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
	
		List<String>lst = Arrays.asList("USA","Japan","India");
        Stream<String>sobj =lst.stream();
        
        long cnt = sobj.filter(n->n.length()>4).count();
        System.out.println("No of strings having char count more than 4");
    
        Stream<String>sobj1=lst.stream()	;
        sobj1.filter(n->!n.isEmpty()).map(n->n.toUpperCase()).sorted();
        

lst.stream().sorted().map(x->x.toUpperCase()).collect(Collectors.toList());
        		}

}
