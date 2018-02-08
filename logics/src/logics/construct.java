package logics;
class Test
{
	int a,b;
	Test()
	{
		System.out.println("test ---------dc");
	    a=20;
	    b=90;
	    int c=a+b;
	    int d=a-b;
	    int e=a*b;
	    int f=a/b;
	    int g=a%b;
	    System.out.println(+a);
	    System.out.println(+b);

	    System.out.println("addition="+c);
	    System.out.println("subtraction="+d);
	    System.out.println("multiplication="+e);
	    System.out.println("module="+f);
	    System.out.println("division="+g);
     }
	Test(int a)
	{
		this();
		System.out.println(+a);
	}
	Test(int a,int b,int c)
	{
		this(a);
		System.out.println(" "+a);
		System.out.println(""+b);
		System.out.println(""+c);
	}
}
public class construct {

	public static void main(String[] args) {
        Test t=new Test();
        Test t1=new Test(100);
        Test t2=new Test(6,5,4);
        
	}

}

