package classobject;

import java.awt.DisplayMode;

public class StaticExample {
	
	int id;
	String name;
	static String colgName="KBP";
	
	public StaticExample()// default constructor
	{
		
	}
	
	public StaticExample(int id,String name)// parameterized constructors
	{
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Id : "+id+" Name: "+name+"College Name: "+colgName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           StaticExample StaticExample1 = new StaticExample(101,"Raj");
           StaticExample StaticExample2 = new StaticExample(102,"Riya");
      //     StaticExample staticExample display();
           
	}

}
