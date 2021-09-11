package solvedexamples;

public class DecToBin_Maze8 {
	static int decTobin(int x) {
		if(x==0)
			return 0;
		else
			return (x%2+10*(decTobin(x/2)));
	}
	
	public static void main(String arg[]) {
		System.out.print(decTobin(Integer.parseInt(arg[0])));
	}

}
