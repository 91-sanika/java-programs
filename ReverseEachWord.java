package edu.com;

public class ReverseEachWord {

	public static void main(String[] args) {
		String Str = "I Love My india";
		
		StringBuffer bf = new StringBuffer(Str);
		String revstr = bf.reverse().toString();
		System.out.println(revstr);
		
	}

}
