package edu.com;

public class Reversenumber {

	public static void main(String[] args) {
		
		int num = 12345;
		String s = String.valueOf(num);
		//string.valueof(num) it convert any num or double into string
		
		StringBuffer bf = new StringBuffer(s);
		String revnum = bf.reverse().toString();
		
		int rn = Integer.parseInt(revnum);
		System.out.println("Reverse number is "+rn);
	}

}
