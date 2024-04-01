package thread;

class Myclass2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("insisde run method"+Thread.currentThread());
	}
	
	}

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Myclass2 ob = new Myclass2();
         Thread tob = new Thread(ob);
         tob.start();
	}

}
