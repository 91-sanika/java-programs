package com.edu.loops;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
			//int a[]= {4,7,3,2,1}; //initialization
			
			int a[];
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter size of an array");
			int size = sc.nextInt();
			
			a=new int[size];
			
			System.out.println("Enter elements "+size);
			for(int i=0;i<a.length;i++) {
				a[i] = sc.nextInt();
			}
			
			for(int i=0;i<a.length;i++) {
				System.out.println("a["+i+"]="+a[i]);
			
	}

}
}