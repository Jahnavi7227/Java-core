package DAY4;

import java.util.Scanner;

/*Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
Courses are: JAVA, PYTHON. the total fees for java is 10k and for python is 7.5k.
Provide constructor to take required details.The default course is JAVA.
Provide following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).*/

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student s=new Student(1,"Jahnavi");
		System.out.printf("The total fee for %s course is %d\n", s.course_joined,s.getTotalFee());
		System.out.println("enter feepaid\n");
		System.out.println("Fee paid for course joined is "+s.getFeePaid(sc.nextInt()));
		System.out.println("The due fee is "+s.getDue());
		System.out.println("enter payment made \n");
		System.out.println("The payment made is 2000 and the remaining is "+ s.payment(sc.nextInt()));
		Student s2=new Student(2,"Naidu","Python");
		System.out.printf("\nThe total fee for %s course is %d\n", s2.course_joined,s2.getTotalFee());
		System.out.println("enter feepaid\n");
		System.out.println("Fee paid for course joined is "+s2.getFeePaid(sc.nextInt()));
		System.out.println("The due fee is "+s2.getDue());
		System.out.println("enter payment made\n");
		System.out.println("The payment made is 2000 and the remaining is "+ s2.payment(sc.nextInt()));
		sc.close();
	}

}
