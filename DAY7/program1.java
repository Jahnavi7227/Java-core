package DAY7;

import java.util.Scanner;

//Take a String and invert the case of characters.
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String str="";
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				String m=s.charAt(i)+"";
				str=str+m.toLowerCase();
			}
			else {
				String k=s.charAt(i)+"";
				str=str+k.toUpperCase();
			}
		}
		System.out.println("The inverted String is "+str);
		sc.close();
	}

}
