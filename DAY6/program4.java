package DAY6;

import java.util.Scanner;

//Accept a string from user and display it vertically. use nextLine() to read a string from user.
public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string\n");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		sc.close();
	}

}
