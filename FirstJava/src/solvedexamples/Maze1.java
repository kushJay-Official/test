package solvedexamples;

import java.util.Scanner;

//for print series =1,2,1,3,2,5,11,8,13,13,17....
public class Maze1 {
	public static void fib(int n) {
		int i, t1=0, t2=1, nt;
		for(i=1; i<=n;i++) {
			nt=t1+t2;
			t1=t2;
			t2=nt;
		}
		System.out.print(t1+" ");
	}
	
	public static void prime(int n) {
		int i,j,flg,cnt=0;
		for(i=2;i<1000;i++) {
			flg=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					flg=1;break;
				}
			}
			if(flg==0) {
				if(++cnt==n)
					System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String arg[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
			fib(n/2+1);
		else
			prime(n/2);
	}
}
