package DAY2;

import java.util.Scanner;


//program to reverse an array


public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter elements into arry\n");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=4;i>=0;i--) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
