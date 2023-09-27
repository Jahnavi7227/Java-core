package DAY2;
//Average Of 5 numbers program

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0,Avg=0;
		System.out.println("Enter 5 numbers\n");
		for(int i=0;i<5;i++) {
			sum=sum+sc.nextInt();
		}
		Avg=sum/5;
		System.out.println("Average of 5 numbers is "+Avg);
		sc.close();

	}

}
