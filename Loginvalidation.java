package edu.com;
import java.util.Scanner;

public class Loginvalidation {
	
	private static String uname,upass;
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		uname=sc.next();
		System.out.println("Enter the password");
		upass=sc.next();
	}
	
	public static void checkUser() {
		if(uname.equalsIgnoreCase("sanika") && upass.equals("sanika123")) {
		System.out.println("Valid user");
		}
		else {
		System.out.println("Invalid user");
	}
	}
	

	public static void main(String[] args) {
	Loginvalidation ob = new Loginvalidation();
	Loginvalidation.input();
	Loginvalidation.checkUser();
	
		
		
	}

}
