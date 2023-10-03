package DAY10;

import java.util.Scanner;

//Accept some numbers from user until 'O' and display sum of +ve numbers.
public class SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int sum=0;
			System.out.println("Enter Numbers\n");
			while(true) {
				int k=sc.nextInt();
				if(k==0) {
					break;
				}
				else if(k>0){
					sum+=k;
				}
				else {
					
				}
			}
			System.out.println(sum);
			sc.close();
	}

}
