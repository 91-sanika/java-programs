package com.edu.arrays;

import java.util.Scanner;

public class Minmaxarrays {

	public static void main(String[] args) {
		int size,i,min,max;
		System.out.println("Enter size of array");
		
		Scanner sc = new Scanner(System.in);
		
		size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter no");
		for(i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		max = a[0];
		for(i=0;i<size;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Max=" +max);
		
		min = a[0];
		for(i=0;i<size;i++) {
			if(a[i]<min) {
				min=a[i];
			}
	}
		System.out.println("Min=" +min);
	}
}
