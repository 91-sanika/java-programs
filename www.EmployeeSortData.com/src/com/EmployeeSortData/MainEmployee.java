package com.EmployeeSortData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee{
	private int eid;
	private String ename;
	private float salary;
	private String dname;
	
	public Employee() {
		super();
	}
	
	public Employee(int eid,String ename,float salary , String dname) {
	super();
	this.eid=eid;
	this.ename=ename;
	this.salary=salary;
	this.dname=dname;
	}

	public int getEid() {
		return eid;
		}
	
	 public void setEid(int eid) {
	        this.eid = eid;
	 }
	 
	 public String getEname() {
	        return ename;
	 }
	 
	 public void setEname(String ename) {
	        this.ename = ename;
	    }

	    public float getSalary() {
	        return salary;
	    }
	
	    public void setSalary(float salary) {
	        this.salary = salary;
	    }

	    public String getDname() {
	        return dname;
	    }

	    public void setDname(String dname) {
	        this.dname = dname;
	    }
	    
	    public String toString() {
	        return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dname=" + dname + "]";
	    }
	}

class EmployeeIDSort implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getEid()>e2.getEid())
			return 1;
		else if(e1.getEid()<e2.getEid())
			return -1;
		else
		return 0;
	} 
}
	
class EmployeeEnameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getEname().compareTo(e2.getEname());
	}
}
	
class EmployeeSalarySort implements Comparator<Employee>{

		@Override
		public int compare(Employee e1, Employee e2) {
			if(e1.getSalary()>e2.getSalary())
				return 1;
			else if(e1.getSalary()<e2.getSalary())
				return -1;
			else
			return 0;
		}
}
class EmployeeDname implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
	return e1.getDname().compareTo(e2.getDname());
	}
}

public class MainEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(401, "Sanika", 5000, "HR");
        Employee e2 = new Employee(102, "Sharda", 6000, "Finance");
        Employee e3 = new Employee(103, "Satishkumar", 4500, "IT");
        Employee e4 = new Employee(304, "Ashish", 7000, "Admin");
        Employee e5 = new Employee(105, "Kavita", 5500, "Sales");
        
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        
	Iterator<Employee>eit = employeeList.iterator();
	
	System.out.println("EID\tSalary\tName\tdname");
	System.out.println("----------------------------------------------------");
	while(eit.hasNext()) { //boolean
		Employee e=eit.next();
		//System.out.println(e);
		System.out.println(e.getEid()+"\t"+e.getSalary()+"\t"+e.getEname()+"\t"+e.getDname());
	}
	//sort based id
	
	Collections.sort(employeeList,new EmployeeIDSort());
	System.out.println(employeeList);
	
	
Iterator<Employee>eit1 = employeeList.iterator();
	System.out.println("Employee Details Based on EID");
	System.out.println("EID\tSalary\tName\tdname");
	System.out.println("----------------------------------------------------");
	while(eit1.hasNext()) { 
		Employee eobj=eit1.next();
		System.out.println(eobj.getEid()+"\t"+eobj.getSalary()+"\t"+eobj.getEname()+"\t"+eobj.getDname());
		
	}		
	
	// sort by Ename
		Collections.sort(employeeList,new EmployeeEnameSort());
		System.out.println(employeeList);
		
		Iterator<Employee>eit2 = employeeList.iterator();
		System.out.println("Employee Details Based on EName");
		System.out.println("EID\tSalary\tName\tdname");
		System.out.println("----------------------------------------------------");
		while(eit2.hasNext()) { 
			Employee eo=eit2.next();
			System.out.println(eo.getEid()+"\t"+eo.getSalary()+"\t"+eo.getEname()+"\t"+eo.getDname());
		}

		//sort by Salary
		Collections.sort(employeeList,new EmployeeSalarySort());
         System.out.println(employeeList);
		
		Iterator<Employee>eit3 = employeeList.iterator();
		System.out.println("Employee Details Based on Salary");
		System.out.println("EID\tSalary\tName\tdname");
		System.out.println("----------------------------------------------------");
		while(eit3.hasNext()) { 
			Employee l=eit3.next();
			System.out.println(l.getEid()+"\t"+l.getSalary()+"\t"+l.getEname()+"\t"+l.getDname());
		}

         //sort by Dname
		
		Collections.sort(employeeList,new EmployeeSalarySort());
        System.out.println(employeeList);
		
		Iterator<Employee>eit4 = employeeList.iterator();
		System.out.println("Employee Details Based on Dname");
		System.out.println("EID\tSalary\tName\tdname");
		System.out.println("----------------------------------------------------");
		while(eit4.hasNext()) { 
			Employee o=eit4.next();
			System.out.println(o.getEid()+"\t"+o.getSalary()+"\t"+o.getEname()+"\t"+o.getDname());
		}

		




}
}