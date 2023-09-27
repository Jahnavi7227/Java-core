package DAY05;

import java.util.Scanner;

/*
// Create classes to store details for two different types of Products,
a) ImportedProducts which has import duty.
b) DiscountedProducts which has discount rate.
All products have name and base_price.Create required Constructors and following methods: print(), getNetPrice(), setPrice(), setImportDuty(), setDiscountRate() also experiment with upcasting and downcasting.
*/
class Products{
	String name;
	int base_price;
	Products(String name,int base_price){
		this.name=name;
		this.base_price=base_price;
	}
	void setPrice(int price) {
			base_price=price;
	}
	void print() {
		System.out.println(this.name+this.base_price);
	}
}
class ImportedProducts extends Products {
	ImportedProducts(String name,int base_price){
		super(name,base_price);
	}
	int k;
		public void setimportduty(int n) {
			k=this.base_price + n;
		}
		public int getNetPrice() {
			if(k>0) {
			return k;
			}
			return this.base_price;
			}
		public void print() {
			System.out.printf("The product is %s and the netprice is %d  \n",this.name,getNetPrice());
		}
		
	
	
	
}
class DiscountedProducts extends Products{
	DiscountedProducts(String name,int base_price){
		super(name,base_price);
	}
	int num;
	public void setDiscountRate(int k) {
		num=this.base_price-k;
	}
	public int getNetPrice()
	{
		if(num>0) {
			return num;
		}
		return this.base_price;
	}
	public void print() {
		System.out.printf("The product is %s and the netprice is %d  \n",this.name,getNetPrice());
	}
	
}
public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter product name and base_price\n");
		ImportedProducts p1=new ImportedProducts(sc.next(),sc.nextInt());
		p1.print();
		System.out.println("Enter the import duty\n");
		p1.setimportduty(sc.nextInt());
		p1.print();
		System.out.println("Enter product name and base_price\n");
		DiscountedProducts p2=new DiscountedProducts(sc.next(),sc.nextInt());
		p2.print();
		System.out.println("Enter product name and base_price\n");
		p2.setDiscountRate(sc.nextInt());
		p2.print();
		System.out.println("\n UPCASTING \n");
		//UPCASTING
		ImportedProducts imported=new ImportedProducts("saamsung",16000);
		imported.print();
		System.out.println();
		Products p5=imported;
		p5.print();
		sc.close();
		

	}
}
