package DAY12;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

// Accept strings until 'end' is given and sort them and write them into Codes.txt and string must be one/more alphabets followed by one/more digits.(use Regular Expressions)
public class Codes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stu
	FileWriter fw=new FileWriter("Codes.txt");
	Scanner sc=new Scanner(System.in);
	ArrayList<String> ar=new ArrayList<String>();
	while(true) {
	String lines=sc.next();
	if(lines.equals("end")) {
		break;
	}
	if(Pattern.matches("^[A-Za-z]+[0-9]+$",lines)) {
	ar.add(lines);
	}
	}

	for(String ele:ar) {
		fw.write(ele+"\n");
	}
	fw.close();
	sc.close();
	}

}
