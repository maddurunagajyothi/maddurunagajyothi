import java.util.Scanner;

abstract class swap
{
	Scanner s=new Scanner(System.in);
	abstract void zero();
}
class sp extends swap
{
	int a=s.nextInt();
	int b=s.nextInt();
	
	void zero()
	{
		System.out.println("enter a number"+a);
		System.out.println("enter second number"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("enter a number"+a);
		System.out.println("enter second number"+b);


	}
}
class sr extends swap
{
	String a1=s.nextLine();
	String b1=s.nextLine();
	//int t=0;
	void zero()
	{
		System.out.println("enter a number"+a1);
		System.out.println("enter second number"+b1);
		String t=a1;
		    a1=b1;
		    b1=t;
		System.out.println("enter a number"+a1);
		System.out.println("enter second number"+b1);

		
		}
}
public class swapdemo
{

	public static void main(String[] args)
	{
		swap p=new sp();
		p.zero();
		p=new sr();
		p.zero();

	}

}
