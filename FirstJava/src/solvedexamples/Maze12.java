package solvedexamples;

public class Maze12 {
	public static void main(String arg[]) {
		String s1=arg[0];
		char c[]=s1.toCharArray();
		int len=s1.length();
		for(int i=0;i<len;i++) {
			if(c[i]=='a'|| c[i]=='e'||c[i]=='i'||
					c[i]=='o'||c[i]=='u') 
				c[i]=Character.toUpperCase(c[i]);
			System.out.print(c[i]);
		}
	}
}
