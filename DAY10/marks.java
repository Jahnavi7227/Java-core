package DAY10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//File Marks.txt, which have marks separated by comma in different lines.Find the total marks of each line and display them.(Use fault tolerance)
public class marks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FileWriter fw=new FileWriter("Marks.txt");
		FileReader fr=new FileReader("Marks.txt");
		System.out.println("Enter the marks separated by comma and enter Null when you are done");
		while(true) {
			String line=sc.nextLine();
			if(line.equals("Null")) {
				break;
			}
			else {
				fw.write(line+"\n");
			}
		}
	
	fw.close();
	fr.close();
	sc.close();

	}

}
