package solvedexamples;

public class Armst_Maze14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		System.out.print(armStrong(num)+"\n");
	}
	static String armStrong(int x) {
		//for counting no of terms
		// which is use for power
		int org=x,cnt=0;
		while(x>0) {
			x=x/10;
			cnt++;
		}
		
		//for checking armstrong no.
		x=org;
		int sum=0, digit;
		while(x>0) {
			digit=x%10;
			x=x/10;
			sum=(int)(sum+Math.pow(digit, cnt));
		}
		
		if(sum==org)
			return "Armstrong Number";
		else
			return "Not Armstrong Number";
	}

}
