package com.edu.arrays;

import java.util.Scanner;

public class Avgofarrays {

public static void main(String[] args) {
	int n,i,sum=0;
	double average;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of array");
	n=sc.nextInt();
	System.out.println("Enter the element");
	int a[]=new int[n];
	
	
	for(i=0;i<n;i++) 
	{
		a[i]=sc.nextInt();
	}
	
	for(i=0;i<n;i++) 
	{
		sum=sum+a[i];
	}
	System.out.println("sum of arryas"+sum);
	
	     average=(sum/n);
	     System.out.println("avg of arryas"+average);	     
}
	}
	