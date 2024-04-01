package com.edu.arrays;

import java.util.Scanner;

public class Sumofarrays {

	public static void main(String[] args) {
		
		int size,i,sum=0;
		System.out.println("Enter size of array");
		
		Scanner sc = new Scanner(System.in);
		
		size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(i=0;i<size;i++) {
			System.out.println("Enter no");
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<size;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum="+sum);
		}
}

