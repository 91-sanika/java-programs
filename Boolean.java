package operator;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =100, j=90, k=707 ,l=800;
		//boolean b =i>j;
		//System.out.println("b="+b);
		
		//logical &&,||
		
		//boolean b1=(i>j && i>k);
	    //boolean b4=(i>j || i>k);

		//ternary
		//int large =(i>j)?i:j;
		//expression)?true:false
		 int large = (i>j && i>k && i>l)?i:(j>i && j>k && j>l)?j:(k>i && k>j && k>l)?k:l;
		System.out.println("largest of"+i+" and "+j+ "and" +k+ "is " +large);
		

	}

}
