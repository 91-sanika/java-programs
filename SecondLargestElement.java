package com.edu.arrays;

import java.util.Scanner;


public class SecondLargestElement {

	    public static void main(String args[]) {
	        int temp, size;
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        size = sc.nextInt();
	        int array[] = new int[size];

	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < size; i++) {
	            array[i] = sc.nextInt();
	        }

	        for (int i = 0; i < size; i++) {
	            for (int j = i + 1; j < size; j++) {
	                if (array[i] > array[j]) {
	                    temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                }
	            }
	        }
	        if (size < 2) {
	            System.out.println("Array does not contain enough elements to find the second largest number.");
	        } else {
	            System.out.println("Second largest number is: " + array[size - 2]);
	        }
	    }
	}
