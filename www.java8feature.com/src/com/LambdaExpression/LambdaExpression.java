package com.LambdaExpression;

@FunctionalInterface

interface Hello{
	public void display(String s);
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		Hello hob =(String str)->{
			System.out.println("Hello "+ str);
		};
          
		hob.display("Sanika");
		
		Runnable rob = ()->{
			for(int i=1;i<=5;i++);
			String i = null;
		System.out.println(i +" "+Thread.currentThread());
		};
	}
}
/* Thread tob = new Thread(rob);
tob.SetName("First");
tob.start();
Thread tob1 = new Thread(rob)
tob1.SetName("Second");
tob1.start();
} */

