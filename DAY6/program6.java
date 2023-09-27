package DAY6;

import java.util.Scanner;

//Accept a string and display the position of space for all spaces.
public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='\s') {
				c++;
				System.out.printf("The position of %d space is %d\n",c,i);
			}
		}
		sc.close();
	}

}
