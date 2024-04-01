package classobject;

public class BlockExample {
	
	int x=5;
	static int y;
	
	static {
		int a=10;
		//x=20;(can use non static field)
		y=25;
		System.out.println(a);
	}
	public static void show(int p)
	{
		System.out.println(p*p*p);
	}
	{
		x=20;
		y=25;
		System.out.println("Instance Block");
		System.out.println(y);
	}
	public BlockExample() {
		System.out.println("In a Constructor");
	}
	public static void main(String[] args) {
		
		
		BlockExample oblect = new BlockExample();
		show(10);
	}

}
