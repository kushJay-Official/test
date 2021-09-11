package solvedexamples;

import java.util.Scanner;

public class Factorial_Maze2 {
	public static int fact(int n) {
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(fact(sc.nextInt()));
	} 
}
