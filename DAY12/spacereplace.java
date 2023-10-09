package DAY12;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Accept a file and replace & one (or) more spaces with a single space.
public class spacereplace {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p=Path.of("/home/jahnavi/eclipse-workspace/ASSIGN/space.txt");
		String lines=Files.readString(p);
		FileWriter fw=new FileWriter("space.txt");
		Pattern p1=Pattern.compile(" +");
		Matcher m=p1.matcher(lines);
		String line=m.replaceAll(" ");
		fw.write(line+"\n");
		fw.close();
	}
}
