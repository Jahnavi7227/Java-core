package DAY12;

import java.util.Scanner;

//Accept a string & display each word on a separate line (use any separator) 
public class stringseparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string\n");
		String s=sc.nextLine();
		String[] arr=s.split("@");
		for(String ele:arr) {
			System.out.println(ele);
		}
		
		sc.close();
	}

}
