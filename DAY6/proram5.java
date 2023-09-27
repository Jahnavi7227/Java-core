package DAY6;
import java.util.Scanner;

//Accept a string that contains marks separated by commas and display total.
public class proram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks seperated by comma\n");
		String s=sc.nextLine();
		String sar[]=s.split(",");
		int sum=0;
		for(int i=0;i<sar.length;i++) {
			sum=sum+Integer.parseInt(sar[i]);
		}
		System.out.println(sum);
		sc.close();
		
		
	}

}
