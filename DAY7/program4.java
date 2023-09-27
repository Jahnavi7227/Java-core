package DAY7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

// Accept starting date and ending date in DD-MM-YYYY format and display no of days between those two.
public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String startdate=sc.nextLine();
		String enddate=sc.nextLine();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate sd=LocalDate.parse(startdate,df);
		LocalDate ed=LocalDate.parse(enddate,df);
		long out=ChronoUnit.DAYS.between(sd,ed);
		System.out.println(out);
		sc.close();
	}
}
