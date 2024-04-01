package edu.com;

public class ReverseEcahwordsentence {

	public static void main(String[] args) {
		
		String s ="welcome to my home";
	    // output= emoclew ot ym emoh
		
		String strarr[]=s.split(" ");
		//for(int i =0;i<strarr.length;i++) {
			//System.out.println(strarr[i]);
		//}
		
		for(String w:strarr) {
			//System.out.println(w);
		StringBuffer w1= new StringBuffer(w);
		String rew = w1.reverse().toString();
		System.out.println(rew+" ");
	}
	}
}
