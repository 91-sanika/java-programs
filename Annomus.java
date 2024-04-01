package thread;

class Mytable{
	public void Table(int num) {
		for (int i=1;i<5;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
}
public class Annomus {

	public static void main(String[] args) {

		Mytable t = new Mytable();
		Thread t1 = new Thread(){
			public void run() {
			
			}
		};
	}

}
