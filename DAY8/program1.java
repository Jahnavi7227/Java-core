package DAY8;

import java.util.Scanner;

//Create an interface called account operation with methods deposit, getBalance.Implement this interface in account class.
interface AccountOperation{
	void deposit(int amount);
	int getBalance();
}
class amount implements AccountOperation{
	int amt;
	public void deposit(int amt) {
		this.amt=amt;
	}
	public int getBalance() {
		return amt;
	}
	
	
}
public class program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		AccountOperation act=new amount();
		System.out.println("enter the deposit amount\n");
		act.deposit(sc.nextInt());
		System.out.print("Account balance is ");
		System.out.println(act.getBalance());
		sc.close();
	}

}
