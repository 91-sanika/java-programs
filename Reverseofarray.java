package com.edu.arrays;

import java.util.Scanner;

public class Reverseofarray {

	public static void main(String[] args) {
		
	System.out.println("Enter the size of an array");
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int a[]=new int[size];
	
	System.out.println("Enter elements for an array");
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
	}
	
	System.out.println("Original array");
	for(int i=0;i<size;i++) {
	System.out.println(a[i]+"");
	}
	

	for(int i=0;i<size/2;i++) {
		int temp = a[i];
		a[i]=a[size-i-1];
		a[size-i-1]= temp;
	}
	
	System.out.println("reversed array");
	for(int i=0;i<size;i++) {
	System.out.println(a[i]+"");
	}
	
	}
}
