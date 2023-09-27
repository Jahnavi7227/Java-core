package DAY4;
//Create a class called counter that stores a number and provides methods to increment, decrement and return the count.
//Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes the values and starts from there.
public class counter {
	int c;
	public counter() {
		c=0;
	}
	public counter (int num) {
		c=num;
	}
	
	public void increment() {
		c++;
	}
	public void  decrement() {
		c--;
	}
	
	public  int count() {
		return c;
		
	}
}
