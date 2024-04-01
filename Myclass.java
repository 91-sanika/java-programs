package thread;

public class Myclass extends Thread {
	
	public void run() {
		
		for(int i=0;i<=5;i++) {
         System.out.println("Display run"+Thread.currentThread());
         
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(Thread.currentThread());
         Myclass ob = new Myclass();
         Myclass ob1 = new Myclass();
         System.out.println("First Thread"+ob.isAlive());
         System.out.println("Second Thread"+ob1.isAlive());
         ob.setName("First");// instead of thread it will name as first
         ob.setPriority(MAX_PRIORITY);//10
         ob.start();
         System.out.println("First Thread"+ob.isAlive());
         ob1.start();
         System.out.println("Second Thread"+ob1.isAlive());//isAlive is used to check whether it is running in jvm 
	}

}
