package DAY4;
//Create a class called counter that stores a number and provides methods to increment, decrement and return the count.
//Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes the values and starts from there.

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counter obj=new counter();
		counter obj2=new counter(5);
		obj.increment();
		obj.increment();
		obj.decrement();
		obj2.increment();
		obj2.decrement();
		System.out.println(obj.count());
		System.out.println(obj2.count());

	}

}
