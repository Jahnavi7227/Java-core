package DAY4;
/*Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
Courses are: JAVA, PYTHON. the total fees for java is 10k and for python is 7.5k.
Provide constructor to take required details.The default course is JAVA.
Provide following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).*/

public class Student {
	int admin_no;
	String stu_name;
	String course_joined="Java";
	int fees_paid;
	int total_fee;
	public Student(int a,String b) {
		this.admin_no=a;
		this.stu_name=b;
		this.fees_paid=0;
	}
	public Student(int a,String b,String c) {
		this.admin_no=a;
		this.stu_name=b;
		this.course_joined=c;
	}
	public int getTotalFee() {
		if(course_joined=="Python"){
			total_fee=7500;
			return total_fee ;
		}
		else {
			total_fee=10000;
		    return total_fee;
		}  
	}
	public int getFeePaid(int num) {
		fees_paid=num;
		return fees_paid;
	}
	public int getDue() {
		return total_fee-fees_paid;
	}
	public int payment(int num) {
		int k=(fees_paid+num);
		return total_fee -k;
		
	}
	

}
