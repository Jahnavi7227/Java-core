package DAY12;

import java.util.Scanner;

//Accept bank account no and check whether it is valid.
public class BankAccount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bank account number\n");
		String num=sc.next();
		if(num.matches("^\\d{11,17}$")){
			System.out.println("Valid Bank Account Number");
		}
		else {
			System.out.println("Invalid Bank Account Number");
		}
		
		sc.close();
	
	}

}
