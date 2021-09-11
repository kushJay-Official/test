package solvedexamples;

public class Fibonacci_maze15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFib(Integer.parseInt(args[0]));
	}
	static void printFib(int n) {
		int f1=0,f2=1,i;
		if(n<0)
			return;
		for(i=1;i<=n;i++) {
			System.out.print(f2+" ");
			int next=f1+f2;
			f1=f2;
			f2=next;
		}
	}

}
