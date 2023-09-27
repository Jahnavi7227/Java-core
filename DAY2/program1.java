package DAY2;
//wage calculation program
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Weekday\n");
		int Day=sc.nextInt();
		System.out.println("Enter No.oF hours worked\n");
		int Hours=sc.nextInt();
		int Wage=0;
		switch(Day) {
		case 1,2,3:
				Wage=Hours*200;
				break;
		case 4,5:
			Wage=Hours*400;
			break;
		case 6:
			Wage=Hours*600;
			break;
		default:
			Wage=Hours*800;
		}
		if(Wage>2000) {
			Wage=(Wage*10)/100+Wage;
			System.out.println("Wage is : " +Wage);
		}
		sc.close();

	}

}
