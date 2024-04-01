package Construct;

public class Parameter {
	 int Add(int A, int B) {  
		 int c= A+B;
		 return c;
		
	 }

	public static void main(String[] args) {
		
		Parameter p = new Parameter();
		int e=10;
		int f=20;
		System.out.println(p.Add(e, f));
	}

}
