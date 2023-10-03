package DAY10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Display lines that contains more than 5 characters.
public class fiveltters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the filename\n");
		String filename=sc.nextLine();
		FileReader fr=new FileReader(filename);
		BufferedReader br=new BufferedReader(fr);
		while(true) {
			String line=br.readLine();
			if(line==null) {
				break;
			}
			else if(line.length()>5) {
				System.out.println(line);
			}
			else {
				
			}
		}
		fr.close();
		br.close();
		sc.close();
	}

}
