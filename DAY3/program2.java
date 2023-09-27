package DAY3;

import java.util.ArrayList;
import java.util.Arrays;


//Create a function that takes multiple number's and display common factors.
public class program2 {
	public static void factors(int...n) {
		int arr[]=new int[3];
		int k=0;
		for(int i:n) {
			arr[k]=i;
			k++;
		}
		int min=0;
		for(int i=0;i<arr.length-1;i++) {
			min=(arr[i]<arr[i+1])?arr[i]:arr[i+1];
		}
		int i=0;
			for(int m=1;m<=min;m++) {
				if(arr[i]%m==0 && arr[i+1]%m==0 && arr[i+2]%m==0) {
					System.out.println(m);
			
			}
		}
		
	}
	public static void main(String[] args) {
		factors(12,24,36);
	}

}
