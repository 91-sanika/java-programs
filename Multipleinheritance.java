package inheritance;

interface A{
	
	void display();//abstract method
	
	default void hello() {
		
		System.out.println("HEllo default from interface A");
	}
	
	static void hello1() {
		
		System.out.println("Hello static from interface A");
	}
		
	}


interface B{
	
	void show();
}

class C implements A,B{
	
	public void display() {
		
		System.out.println("interface A");
	}
	
     public void show() {
    	 
	System.out.println("interface B");
}
}

public class Multipleinheritance {

	public static void main(String[] args) {
		 C c = new C();
		 c.display();
		 c.show();
		 A.hello1();// to call the static method we have to call interface/class and static method

	}

}
