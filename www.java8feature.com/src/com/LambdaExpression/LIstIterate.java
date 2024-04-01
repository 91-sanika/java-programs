package com.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LIstIterate {

	
	public static void main(String[] args) {
	List<Integer>lst = new ArrayList<Integer>();
	
	for(int i=1;i<=10;i++) {
		lst.add(i);
	}
        
	lst.forEach((n)->System.out.println(n));
	}

}
