package thread;

class Myclass3 extends Thread{
	
	public void run() {
		System.out.println("inside run method"+Thread.currentThread());
	}
}
public class Extendsthreadclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Myclass3 ob = new Myclass3();
          Myclass3 ob1 = new Myclass3();
          ob.setName("First");
          ob.start();
          ob1.setName("Second");
          ob1.start();
          
	}

}
