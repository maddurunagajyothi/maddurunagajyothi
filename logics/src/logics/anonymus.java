package logics;
import java.util.Scanner;
interface Aop
{
	Scanner s=new Scanner(System.in);
	void add();
	default void disp()
	{
		
	}
}
public class anonymus {

	public static void main(String[] args) {
		Aop as=new Aop()
				{
			public void add()
			{
				System.out.println("enter two int values");
				int a=s.nextInt();
				int b=s.nextInt();
				System.out.println("sum"+(a+b));
			}
	    };
	    as.add();
	    Aop ps=new Aop()
	    {
	    	public void add()
	    	{
	    		System.out.println("enter two string values");
	    		int c=s.nextInt();
	    		int d=s.nextInt();
	    		System.out.println("mul values"+(c*d));
	    	}
	    };
	    ps.add();
	}
}
	    