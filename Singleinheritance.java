package inheritance;

class Parent1{
	 String name = "Satishkumar";
	 String surname = "Parekh";
	 void displayParent1() {
	System.out.println("My father name is ="+ name);
}
	 void msg() {
		 System.out.println("Parent Class");
	 }
}
class child1 extends Parent1{
	String cname = "Sanika";
	String surname = "shah";
	void displayChild1() {
	System.out.println("My surname is ="+ super.surname);
	System.out.println("My name is ="+ cname);
	//System.out.println("My surname is ="+ surname);
	}
	void msg() {
		super.msg();
		System.out.println("child class");
	}
}
	

public class Singleinheritance {

	public static void main(String[] args) {
        child1 c = new child1();
        Parent1 p = new Parent1();
        c.displayChild1();
        p.displayParent1();
        c.msg();
        p.msg();
        }

}
