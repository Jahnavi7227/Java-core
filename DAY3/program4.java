package DAY3;
public class program4 {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	product p=new product();
	p.init(15,"JAHNAVI",15000);
	p.print();
	p.getNetPrice();
	int k=p.purchase();
	System.out.println(k);
	int l=p.sell();
	System.out.println(l);


}

}

