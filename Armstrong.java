package com.edu.loops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num,orgnum,dc=0,d,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		orgnum = sc.nextInt();
		num=orgnum;
		
		while(num>0) {
			dc++;
			num=num/10;
		}
		num=orgnum;
		while(num>0);
		{
			d=num%10;
			sum=(int)(sum+Math.pow(d,dc));
			sum+=Math.pow(d,dc);
		}
		if(sum==orgnum) {
			System.out.println(orgnum+" is Armstrong number");
		}
		else {
			System.out.println(orgnum+" is not Armstrong number");
		}
			}
		}
