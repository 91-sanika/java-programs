package inheritance;

class Vehicle{
	String vehicle="FOUR wheeler";
	
	void displayVehicle(){
		System.out.println("Category of vehicle is ="+vehicle);
		}
}

class Car extends Vehicle{
	String car="BMW";
	
	void displayCar(){
		System.out.println("Name of the car  is ="+ car);
		}
}

class BMW extends Car{
	String BMW="XM model";
	
	void displayBMW(){
		System.out.println("Model of the BMW is="+ BMW);
		}
}


public class Mulilevelinheritance {


	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.displayVehicle();
		b.displayCar();
		b.displayBMW();

	}

}
