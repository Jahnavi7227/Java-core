package DAY2;
//program to find the lagest factor

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number\n");
		int n=sc.nextInt();
		int target=1;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				target=i;
			}
			
		}
		System.out.println("The largest factor is "+ target);
		sc.close();
	}

}
