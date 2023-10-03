package DAY10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Accept names from user until 'END' is given and write them into names.txt as one name for line.
public class Names {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename\n");
		String filename=sc.nextLine();
		FileWriter fw=new FileWriter(filename); 
		System.out.println("enter the strings");
		while(true) {
			String s=sc.next();
			if(s.equals("END")) {
				break;
			}
			else {
				fw.write(s+"\n");
			}
		}
		fw.close();
		sc.close();

	}

}
