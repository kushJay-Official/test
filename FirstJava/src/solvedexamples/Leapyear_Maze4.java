package solvedexamples;

public class Leapyear_Maze4 {
	public static void main(String[] arg) throws Exception{
		int y=0;
		try {
			y=Integer.parseInt(arg[0]);}
		catch(NumberFormatException nfe) {
			System.out.print("Invalid Integer\n");}
		
		Year u= new Year();
		System.out.print(u.checkleap(y));
	}
}

class Year{
	String checkleap(int y) {
		if(((y%4==0)&&(y%100!=0))||(y%400 ==0))
			return "Leap Year";
		else
			return "Not Leap Year";
	}
}
