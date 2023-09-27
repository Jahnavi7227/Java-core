package DAY7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

//accept 5 dates in dd-mm-yyyy format and display the sorted dates
public class program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate arr[]=new LocalDate[5];
		for(int i=0;i<arr.length;i++) {
			String s=sc.nextLine();
			arr[i]=LocalDate.parse(s,df);
			}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String k=df1.format(arr[i]);
			System.out.println(k);
		}
		sc.close();
	}
}
