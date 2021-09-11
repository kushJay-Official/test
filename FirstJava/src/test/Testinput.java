package test;

import java.util.*;
import java.util.stream.Stream;

public class Testinput {
	public static void main(String[] arg) {
		String num="12 1 8 9 6 5 0";
		int[] ar;
		ar= getInput(num,4);
		ar=getInput(num);
		
		for(int i=0;i<7;i++)
			System.out.println(ar[i]);
	}
	
	public static int[] getInput(String in, int n) {
		int[] ar = new int[n];
		int j=0;
		Scanner sc=new Scanner(in);
		while(sc.hasNextInt())
			ar[j++]=sc.nextInt();
		return ar;
	}
	
	public static int[] getInput(String in) {
		int ar[]= Stream.of(in.split(" "))
					.mapToInt(token->Integer.parseInt(token))
					.toArray();
		return ar;
	}

}
