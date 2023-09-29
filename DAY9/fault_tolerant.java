package DAY9;

import java.util.Scanner;

//Accept five string which contains numbers and display the total for those numbers. Make your program fault tolerant
public class fault_tolerant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int i=0;
		while(i<5) {
			System.out.println("enter the numbers  ");
			String s=sc.next();
			try {
				int n=Integer.parseInt(s);
				sum=sum+n;
				i++;
			}
			catch(NumberFormatException ex){
				System.out.println("Enter the valid numbers!\n");
			}
			
		}

		System.out.println("The total of the 5 numbers is "+sum);
		sc.close();
	}
}
