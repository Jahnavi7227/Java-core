package DAY4;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p=new product();
		product p1=new product(201,"Oppo",21000);
		System.out.printf("The product id is %d and the product name is %s and the price is %d\n",p.prod_id,p.prod_name,p.price);
		System.out.printf("The product id is %d and the product name is %s and the price is %d\n",p1.prod_id,p1.prod_name,p1.price);
	}

}
