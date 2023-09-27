package DAY2;

import java.util.Scanner;

//Program to print the reverse of the number


public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number\n");
		int n=sc.nextInt();
		int k=n;
		int temp=0;
		int reverse=0;
		while(n>0) {
			temp=n%10;
			reverse=reverse*10+temp;
			n=n/10;
		}
	System.out.printf("Reverse of %d is %d",k,reverse);
	sc.close();
	}

}
