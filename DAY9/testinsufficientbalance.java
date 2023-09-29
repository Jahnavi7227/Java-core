package DAY9;
import java.util.Scanner;
//Create insufficientBalanceException with message "Insufficient BAlance X for withdraw of Y".
class Insufficientbalance extends Exception {
      public Insufficientbalance(){
    	  super("Insufficient Balance!");
      }
      public Insufficientbalance(String msg) {
    	  super(msg);
      }
      
}
class Balance {
	 int balance;
     Balance(int value) {
   	  this.balance=value;
     }
     void withdraw(int value) throws Insufficientbalance {
    	 int b=(int)Math.abs(balance-value);
    	 String s="Insufficient amount " +  b + " for " +value;
    	 if(value>this.balance) {
    		 throw  new Insufficientbalance(s);
    	 }
    	balance =balance-value;
    	
     
     }
    
     void print() {
    	 System.out.println("Remaining Balance is "+balance);
     }
}
public class testinsufficientbalance{
	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner sc=new Scanner(System.in);
		Balance ifb=new Balance(50000);
		try {
			System.out.print("Enter the withdraw amount ");
			ifb.withdraw(sc.nextInt());
		} catch (Insufficientbalance e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	ifb.print();
		sc.close();
	
	}

}
