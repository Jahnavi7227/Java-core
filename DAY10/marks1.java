package DAY10;
//File Marks.txt, which have marks separated by comma in different lines.Find the total marks of each line and display them.(Use fault tolerance)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class marks1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("Marks.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		while(true) {
			line=br.readLine();
			if(line==null) {
				break;
		}
			int sum=0;
			String arr[]=line.split(",");
			for(String ele:arr) {
				sum= Integer.parseInt(ele) +sum;
			}
			System.out.println("The total of line "+line +" is "+sum);
		}
		fr.close();
		br.close();
	}

}
