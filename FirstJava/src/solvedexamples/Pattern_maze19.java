package solvedexamples;

public class Pattern_maze19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,k;
		for(i=1;i<=5;i++) {
			for(j=1;j<5;j++)
				System.out.print(" ");
			for(k=1;k<(i*2);k++)
				System.out.print(k);
			System.out.print("\n");
		}
		for(i=4;i>=1;i--) {
			for(j=5;j>i;j++)
				System.out.print(" ");
			for(k=1;k<(i*2);k++)
				System.out.print(k);
			System.out.print("\n");
		}
	}
}
