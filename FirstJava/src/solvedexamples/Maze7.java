package solvedexamples;

public class Maze7 {
	static int f[]=new int[10];
	
	static void preCompute() {
		f[0]=f[1]=1;
		for(int i=2;i<10;++i) 
			f[i]=f[i-1]*i;
	}
	
	static boolean isStrong(int x) {
		int fctsum=0,tmp=0;
		while(tmp>0) {
			fctsum+=f[tmp%10];
			tmp/=10;
		}
		return (fctsum==x);
	}
	
	public static void main(String arg[]) {
		preCompute();
		int x=Integer.parseInt(arg[0]);
		if(isStrong(x))
			System.out.print("Yes\n");
		else
			System.out.print("No\n");
		
		for(int i=0;i<10;i++)
			System.out.print(f[i]+" ");
	}
	
}
