package DAY10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//Accept a filename from user and display how many uppercase, lowercase and digits the file has.
public class CASE {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int uppercase = 0;
		int lowercase = 0;
		int othercase = 0;
		Scanner sc = new Scanner(System.in);
		try {

			FileReader fr = new FileReader("names.txt");
			while (true) {
				int ch = fr.read();
				if (ch == -1) {
					System.out.println(uppercase);
					System.out.println(lowercase);
					System.out.println(othercase);
					break;
				}
				char c = (char) ch;
				if (Character.isUpperCase(c)) {
					uppercase++;
				} else if (Character.isLowerCase(c)) {
					lowercase++;
				} else {
					othercase++;
				}
			}
		} catch (Exception e) {
			System.out.println("file not found");
		}
	}
}
