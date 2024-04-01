package inheritance;

class Animal{
	String Animal="Domastic";
	
	void displayAnimal(){
		System.out.println("Category of Animal is ="+Animal);
		}
}
	
class cat extends Animal{ 
String cat="abc";
	
	void displayCat(){
		System.out.println("Category of cat is ="+cat);
		}

}

class Dog extends Animal{ 
String Dog ="xyz";
	
	void displayDog (){
		System.out.println("Category of Dog  is ="+Dog );
		}
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.displayAnimal();
		cat c = new cat();
		c.displayCat();
		d.displayDog();
		

	}

}
