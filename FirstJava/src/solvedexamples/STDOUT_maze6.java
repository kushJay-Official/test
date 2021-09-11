package solvedexamples;

public class STDOUT_maze6 {
	public static void main(String arg[]) {
		int n1,i, flg=0;
		n1=Integer.parseInt(arg[0]);
		float sqrt;
		for(i=2;i<n1;i++) {
			if(n1%i==0)
				flg=1;
		}
		
		//for prime no;
		if(flg==0) {
			System.out.print("It is a Prime No.\n");
			sqrt=(float) Math.sqrt(n1);
		}
		else {
			System.out.print("It is a not Prime No.\n");
			sqrt=(float) 0.00;
		}
		
		//for round off
		double rndoff= Math.round(sqrt*100.00)/100.00;
		System.out.print(rndoff);
	}
}
