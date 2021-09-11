package solvedexamples;
//for perfect square
public class Mzae10 {
	static boolean isPerfectSqure(int x) {
		double sr=Math.sqrt(x);
		return ((sr-Math.floor(sr))==0);
	}
	
	public static void main(String arg[]) {
		int x=Integer.parseInt(arg[0]);
		if(isPerfectSqure(x))
			System.out.print("Yes\n");
		else
			System.out.print("No\n");
	}
}
