package DAY05;

import java.util.Scanner;

//Create a sub-class called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.Create a super-class related to this sub class.
class Employee{
	String name;
	Employee(String name){
		this.name=name;
	}
	
}
class FactoryEmployee extends Employee{
	int bus_no;
	String emp_board;
	FactoryEmployee (String name,int num,String naam){
		super(name);
		this.bus_no=num;
		this.emp_board=naam;
		
	}
	
	void display() {
		System.out.println("["+this.name +"," + this.bus_no+","+this.emp_board+"]");
//		System.out.println(this.bus_no);
//		System.out.println(this.emp_board);
	}
	
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of factory employess\n");
		int n=sc.nextInt();
		FactoryEmployee [] fac=new FactoryEmployee[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the details as empname empid emp_board");
		fac[i]=new FactoryEmployee(sc.next(),sc.nextInt(),sc.next());
		}
		for(int i=0;i<n;i++) {
		fac[i].display();
		}
		sc.close();

	}

}
