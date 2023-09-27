package DAY8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//Make person objects sortable by age.
class person{
	String name;
	int age;
	person(String s,int a){
		this.name=s;
		this.age=a;
	}
	public String toString() {
		return name+" "+age;
		
	}
}

class sortbyage implements Comparator<person>{
	public int compare(person p,person p1) {
		return p.age-p1.age;
	}
}
public class testperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<person> per=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of persons\n");
		int k=sc.nextInt();
		for(int i=0;i<k;i++) {
			System.out.println("enter the name and age\n");
			per.add(new person(sc.next(),sc.nextInt()));
		}
		Collections.sort(per,new sortbyage());
		for(var v:per) {
			System.out.println(v);
		}
		sc.close();
	}

}
