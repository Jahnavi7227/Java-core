package DAY6;

import java.util.Arrays;
import java.util.Scanner;

//Create an array of 10 elements fill it with random no and display array elements which are greater than average of array.
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the max range for selecting random numbers");
		int max=sc.nextInt();
		int arr[]=new int[10];
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*max);
			sum=sum+arr[i];
			System.out.println(arr[i]);
		}
		avg=sum/10;
		System.out.println("Average is "+avg);
		System.out.println("The numbers greater than avg are \n");
		for(int i=0;i<10;i++) {
			if(arr[i]>avg) {
				System.out.println(arr[i]);
			}
			
		}
		System.out.println(Arrays.toString(arr));
		double k=Math.PI;
		System.out.println(k);
		sc.close();
		

	}

}
