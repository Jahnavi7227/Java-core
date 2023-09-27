package DAY3;
//Create a function that takes a set of integers and return the largest of integers.

public class program1 {
	public static int largest(int...num) {
		int target=0;
		for(int i:num) {
			if(i>target) {
				target=i;
			}
		}
		return target;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largest(2,3,4,5,7,8,19));
		
		

	}

}
