package com.LambdaExpression;

//default int method(int x, int y)  //this is default method
//{
  //   return (x*y);
//}

//-A default method is by default available to all the implementation classes of the interface.
//-If implementation class wants to use it , it can use it , otherwise it can ignore and continue using its own methods.


//Program: write a program to understand how to use default methods of an interface

//an interface with a default method

interface MyInter{
    int add(int x, int y);  //this method is abstract

   default int mult(int x, int y) //this method is default method
   {
            return (x*y);
    }
}

 class MyClass implements MyInter{
    public int add(int x, int y){
                 return (x+y);
   }

}

public class DefaultDemo1{
      public static void main(String args[]){
   //Interface reference can refer to object of its implementation classes
              MyInter mi=new MyClass();
             System.out.println("sum="+mi.add(9,8));
           //default method is by default available in implementation class
            System.out.println("Product="+mi.mult(7,6));
             
     }
}