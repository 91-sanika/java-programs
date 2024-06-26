package thread;

class Train {
	synchronized public void bookTicket() {
		  for(int i=1;i<5;i++)
			System.out.println(Thread.currentThread()+" booked the ticket");
		}
}


class SynchronizedClass1 extends Thread{
	
	Train tob;
  public SynchronizedClass1(Train tob) {
		this.tob = tob;
	}

public void run() {
   tob.bookTicket();
 }
}
class SynchronizedClass2 extends Thread{
	Train tob;
	
	  public SynchronizedClass2(Train tob) {
		this.tob=tob;
	}

	public void run() {
	    tob.bookTicket();
	 }
	}

public class Bookticketexample {

	public static void main(String[] args) throws InterruptedException {
		Train tob = new Train();
		SynchronizedClass1 sob1 = new SynchronizedClass1(tob);
		sob1.setName("first");
		SynchronizedClass2 sob2 = new SynchronizedClass2(tob);
		sob2.setName("second");
		sob1.start();
	
		sob2.start();
	}

}