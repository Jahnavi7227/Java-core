package DAY8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Design classes that need to sort collection of product objects either by product name or by price.
class product{
	public int prod_id;
	public String prod_name;
	public int price;
	product(int p,String k,int m){
		this.prod_id=p;
		this.prod_name=k;
		this.price=m;
	}
	void print() {
		System.out.println(this.prod_id);
		System.out.println(this.prod_name);
		System.out.println(this.price);
	}

  public String toString() {
	return prod_id+" "+prod_name+" "+price;
}
}
	class sortingbyname implements Comparator<product>{
		public int compare(product p1,product p2) {
			return p1.prod_name.compareTo(p2.prod_name);
		}
}
class sortingbyprice implements Comparator<product>{
		public int compare(product p1,product p2) {
			return p1.price - p2.price;
		}
	}
public class testproduct {
	public static void main(String[] args) {
		ArrayList<product> pro=new ArrayList<product>();
		pro.add(new product(1,"OPPO-V1",15000));
		pro.add(new product(2,"OPPO-V2",25000));
		pro.add(new product(3,"SAMSUNG",35000));
		pro.add(new product(4,"I-PHONE",45000));
		sortingbyname sb=new sortingbyname();
		Collections.sort(pro,sb);
		System.out.println("\nsorting by name\n");
		for(var v:pro) {
			System.out.println(v);
		}
		System.out.println("\nsorting by price\n");
		Collections.sort(pro,new sortingbyprice());
		for(var v:pro) {
			System.out.println(v);
		}
	
	}
}
