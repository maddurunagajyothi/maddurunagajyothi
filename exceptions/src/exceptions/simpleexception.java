package exceptions;
import java.util.Scanner;
//import java.io.FileNotFoundException;
//import java.io.IOException;

public class simpleexception {

	public static void main(String[] args) {
		try
		{
			Scanner s=new Scanner(System.in);
			String s1=s.nextLine();
			System.out.println(s);
			String sl=s1.replace("a","i");
			String sr=sl.concat(sl);
			int n=54/0;
			System.out.println("   "+n);
	    }
		catch(ArithmeticException ae)
		{
			System.out.println("calculate value");
		}
		catch(ArrayIndexOutOfBoundsException fe)
		{
			System.out.println("not found");
		}
		finally
		{
			System.out.println("complete program");
		}

	}

}
