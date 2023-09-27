package DAY7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Accept Strings until empty string is given And display the largest String.
public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=0;
		ArrayList<String> sr=new ArrayList<>();
		System.out.println("enter  the strings ");
		while(true) {
			String s=sc.nextLine();
			if(s.isBlank()) {
				break;
			}
			else {
				sr.add(s);
				c++;
			}
		}
		
		Collections.sort(sr);
		System.out.println(sr);
		System.out.println("The largest String is"+sr.get(c-1));
		sc.close();
		
	}

}
