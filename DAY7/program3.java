package DAY7;

import java.util.Scanner;

//Accept names until end is given and display all the names separated by '-'.
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split("-");
		for(String ele :arr) {
			System.out.println(ele);
		}
		sc.close();
	}

}
