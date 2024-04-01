package com.LambdaExpression;

interface One{
	default void message()
	{
		System.out.println("One interface message");
	}
	void add();
}
interface Two{
	default void message() {
		System.out.println("Two interface message");
	}
	void sub();
}

class ImplClass implements One,Two{
	public void add() {
		System.out.println("add method");
	}
	public void sub() {
		System.out.println("subtract method");
	}
	@Override
	public void message() {
		// TODO Auto-generated method stub
		One.super.message();
		Two.super.message();
	}
	
}

public class MultipleInheritencejava8Interface {

	public static void main(String[] args) {
		ImplClass ob = new ImplClass();
		ob.add();
		ob.sub();
		ob.message();

	}

}


/*package com.edu.lambda;

interface One{
	default void message()
	{
		System.out.println("One interface message");
	}
	void add();
	
	public static void methodstaticjava9() {
		System.out.println("static method java9 feature");
	}
}
interface Two{
	default void message() {
		System.out.println("Two interface message");
	}
	void sub();
}

class ImplClass implements One,Two{
	public void add() {
		System.out.println("add method");
	}
	public void sub() {
		System.out.println("subtract method");
	}
	@Override
	public void message()
	{
		System.out.println("ImplClass message");
		One.super.message();
	}
}

public class MultipleInheritencejava8Interface {

	public static void main(String[] args) {
		ImplClass ob = new ImplClass();
		ob.add();
		ob.sub();
		ob.message();
		One.methodstaticjava9(); //static method calling

	}

}*/