package DAY3;
//Consider command line arguments num, length as inputs(where length is optional)if you won't get that use default number as length.
public class program3 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int m=(args.length==2)?Integer.parseInt(args[1]):10;
		for(int i=1;i<=m;i++) {
			System.out.printf("%d x %d = %d \n",n,i,n*i);
		}
	}

}
