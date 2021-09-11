package solvedexamples;

public class GCD_maze5 {
	public static void main(String arg[]) {
		int n1,n2,gcd=0,i;
		n1=Integer.parseInt(arg[0]);
		n2=Integer.parseInt(arg[1]);
		for(i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		System.out.print(gcd+"\n");
	}
}
