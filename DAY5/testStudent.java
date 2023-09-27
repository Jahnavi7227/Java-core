package DAY05;

class Person {
protected String name, email;
public Person(){
	this.name="adhya";
	this.email="adhya1232@gmail.com";
}
public Person(String name, String email) {

	this.name = name;
	this.email = email;
}

public void print() {

System.out.println(this.name);
System.out.println(this.email);

}
}
class Student extends Person{
	String course;
	public Student(String name, String email,String course) {
		super(name, email);
		this.course=course;
		// TODO Auto-generated constructor stub
	}
	public Student(String course) {
		this.course=course;
	}
	public Student() {
		this.name="Aradhya";
		this.email="Aradhya.123@gmail.com";
		this.course="AI";
	}
	public void print() {

		System.out.println(this.name);
		System.out.println(this.email);
		System.out.println(this.course);
		}
	
}
public class testStudent{
	public static void main(String[] args) {
		Student s=new Student("Jahnavi","saijahnavi203@gmail.com","JAVA\n");
		System.out.println("using student constructor\n");
		System.out.printf("Student %s with mail id %s opted the course %s \n",s.name,s.email,s.course);
		Person s1=new Student();
		Person s2=new Person();
		s1.print();
		System.out.println();
		s2.print();
	
		
		
	
	}
}
