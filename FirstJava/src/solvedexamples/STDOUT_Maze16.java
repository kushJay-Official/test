package solvedexamples;

public class STDOUT_Maze16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
		if(x>0&&x<31) {
			if(x%2==0)
				System.out.print(evenSeries(x/2));
			else
				System.out.print(oddSeries(x/2+1));
		}
	}
	static int oddSeries(int x) {
		return (int)(Math.pow(2, x-1));
	}
	
	static int evenSeries(int x) {
		return (int)(Math.pow(3, x-1));
	}

}
