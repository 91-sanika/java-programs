package com.Product;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Product{
	
	private int PId;
	private String Pname;
	private int  Price;

	public Product() {
		super();
	}
	
	public Product(int PId,String Pname, int Price) {
		super();
		this.PId = PId;
		this.Pname = Pname;
		this.Price = Price;
		}
	
	public int getPId() {
		return PId;
	}
	
	public String getPname(){
		return Pname;
	}
	
	public int getPrice() {
		return Price;
	}
	
	 public String toString() {
	        return "Produt[PId=" + PId + ", Pname=" + Pname + ", Price=" + Price+"]" ;
	 
	       
}
}


class ProductPIdsort implements Comparator<Product>{


	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getPId()>p2.getPId())
			return 1;
		else if(p1.getPId()<p2.getPId())
			return -1;
		else return 0;
	}
	
}

class ProductPricesort implements Comparator<Product>{
	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getPrice()>p2.getPrice())
			return 1;
		else if(p1.getPrice()<p2.getPrice())
			return -1;
		else return 0;
			
		}
	}

class ProductPnamesort implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
	return p1.getPname().compareTo(p2.getPname());
	}
	
}
public class MainAppProduct {

	public static void main(String[] args) {
		
		Product p1 = new Product(99,"Mouse",1000);
		Product p2 = new Product(89,"Ac",5000);
		Product p3 = new Product(98,"Laptop",70000);
		Product p4 = new Product(87,"Mobile",15000);
		
	TreeSet <Product> ts = new TreeSet<Product>(new ProductPIdsort());
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		System.out.println(ts);
		
		Iterator<Product>pit = ts.iterator();
		System.out.println("After sorting by Id");
		System.out.println("PId\tPname\tPrice");
		System.out.println("----------------------------------------------------");
		while(pit.hasNext()) { 
			Product o=pit.next();
			System.out.println(o.getPId()+"\t"+o.getPname()+"\t"+o.getPrice());
		}
		
		TreeSet <Product> ts1 = new TreeSet<Product>(new ProductPricesort());
		ts1.add(p1);
		ts1.add(p2);
		ts1.add(p3);
		ts1.add(p4);
		System.out.println(ts1);
		
		Iterator<Product>pit1 = ts.iterator();
		System.out.println("After sorting by Price");
		System.out.println("PId\tPname\tPrice");
		System.out.println("----------------------------------------------------");
		while(pit1.hasNext()) { 
			Product o1=pit1.next();
			System.out.println(o1.getPId()+"\t"+o1.getPname()+"\t"+o1.getPrice());
		}
		
		TreeSet <Product> ts2 = new TreeSet<Product>(new ProductPnamesort());
		ts2.add(p1);
		ts2.add(p2);
		ts2.add(p3);
		ts2.add(p4);
		System.out.println(ts1);
		
		Iterator<Product>pit2= ts.iterator();
		System.out.println("After sorting by Pname");
		System.out.println("PId\tPname\tPrice");
		System.out.println("----------------------------------------------------");
		while(pit2.hasNext()) { 
			Product o2=pit2.next();
			System.out.println(o2.getPId()+"\t"+o2.getPname()+"\t"+o2.getPrice());
		}

	}
}


