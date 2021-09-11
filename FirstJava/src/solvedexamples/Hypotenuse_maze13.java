package solvedexamples;

public class Hypotenuse_maze13 {
	public static void main(String arg[]) {
		float pld,bas;
		pld=Float.parseFloat(arg[0]);
		bas=Float.parseFloat(arg[1]);
		pld=pld*pld;
		bas=bas*bas;
		float hypo=(float) Math.sqrt(pld+bas);
		System.out.print(hypo+"\n");
	}

}
