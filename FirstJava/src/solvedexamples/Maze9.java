package solvedexamples;

public class Maze9 {
	static int isPrime(int x) {
		int flg=0;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				flg=1;
				break;
			}
		}
		if(flg==1)
			return 0;
		else
			return x;
	}
	
	public static void main(String arg[]) {
		int lb,ub, sum=0;
		lb=Integer.parseInt(arg[0]);
		ub=Integer.parseInt(arg[1]);
		
		for(int i=lb+1;i<ub;i++)
			sum+=isPrime(i);
		System.out.print(sum+"\n");
	}

}
