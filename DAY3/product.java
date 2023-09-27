package DAY3;
class product {
	int prod_id;
	String prod_name;
	int price;
	static int quan_on_hand=1;
	public  void init(int id,String name,int price) {
		this.prod_id=id;
		this.prod_name=name;
		this.price=price;
		
}
	void print() {
		System.out.println(prod_id);
		System.out.println(prod_name);
		System.out.println(price);
	}
	public void getNetPrice() {
		this.price=price+(price*12)/100;
		System.out.println( price);
	}
	public int purchase() {
		quan_on_hand++;
		return quan_on_hand;
	}
	public int sell() {
		if(quan_on_hand==0) {
			return 0;
		}
		quan_on_hand--;
		return quan_on_hand;
	}
	
	
}
