package com.edu.arrays;

import java.util.Scanner;
public class TwoDimensionalarray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter no of rows in an array");
		int m = sc.nextInt();
		
		System.out.println("Enter no of columns in an array");
		int n = sc.nextInt();
		
		int a[][] = new int [m][n];
		System.out.println("Enter elements for an array=");
		for(int i=0;i<m;i++) {
			for(int j =0;j<n;j++) {
			a[i][j]=sc.nextInt();
		}
		}
		
		System.out.println("elements of arrays=");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++){
			System.out.println(a[i][j]+"");	
			}
			}
		
	}
	}
