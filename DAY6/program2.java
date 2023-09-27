package DAY6;

import java.util.Scanner;

//Guess the random number in three attempts. Design a program for this, range is (1 to 25).
public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=(int)(Math.random()*25)+1;
		System.out.println(num);
		System.out.println("Your guessing number can be from 1 to 25\n");
		for(int i=1;i<=3;i++) {
			System.out.printf("Enter your %d guess\n",i);
			int k=sc.nextInt();
			if(k==num) {
				System.out.println("you guessed it right!!!");
				break;
			}
			else {
				System.out.println("you haven't guessed it right!!");
			}
		}
			
		
		System.out.println("END!");
		sc.close();

	}

}
