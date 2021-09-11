package solvedexamples;
//command line argument
public class Area_Maze3 {
	public static void main(String[] arg)throws Exception {
		float r =0;
		try {
			r=Float.parseFloat(arg[3])/2;}
		catch (NumberFormatException nfe) {
			System.out.print("the argument should be Integer\n");}
		
		Circle c=new Circle();
			System.out.print(c.area(r)+"\n");
	}
}
class Circle {
	float area(float n) {
		return (float)(3.14*n*n);
	}
}
