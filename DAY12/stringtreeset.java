package DAY12;

import java.util.Comparator;
import java.util.TreeSet;

//Create a treeset of strings and sort them by length (use Comparator) 
class stringtree{
	String name;
	stringtree(String naam){
		this.name=naam;
	}
	public String toString(){
		return "The element is "+ name +" and the length is "+name.length() ;
	}
	
}
class sotybylenggth implements Comparator<stringtree> {
	public int compare(stringtree s1,stringtree s2) {
	return s1.name.length()-s2.name.length();
	
}
}
public class stringtreeset {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(System.in);
		TreeSet<stringtree> ts=new TreeSet<>(new sotybylenggth());
		stringtree st[]= {
				new stringtree("JAHNAVI"),
				new stringtree("AMULYA"),
				new stringtree("ANITHA KAKARLA"),
				new stringtree("KALYANI  VAMANA"),
				new stringtree("BHANU CHODISETTY"),
				new stringtree("JANU ADABALA")
				};
	
		for(stringtree ele:st) {
			ts.add(ele);
		}
		for(Object ele:ts) {
			System.out.println(ele);
		}
	}
}