package solvedexamples;

public class Palindrome_maze11 {
	static int reverse(int n, int tmp) {
		if(n==0)
			return tmp;
		tmp=(tmp*10)+(n%10);
		
		return reverse(n/10, tmp);
	}
	
	public static void main(String arg[]) {
		int x=Integer.parseInt(arg[0]);
		int rv=reverse(x,0);
		if(x==rv)
			System.out.print("Palindrome Number");
		else
			System.out.print("Not Palindrome Number");
	}

}
