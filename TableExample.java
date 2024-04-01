package thread;

//public class TableExample {
	
class MyTable{
		synchronized public void TablePrint(int num) {
				for(int i=1;i<=10;i++) {
					System.out.println(num+"x"+i+"="+num*i); 
				}//for
			}
		}

public class TableExample {

			public static void main(String[] args) {
				MyTable table = new MyTable();
				
				Thread t1 = new Thread() {
					
					public void run() {
						table.TablePrint(2);
					}
				};
				t1.start();
				
		    Thread t2 = new Thread() {
					
					public void run() {
						table.TablePrint(5);
					}
		    };
				t2.start();
				
				
			}

}

