package exceptions;

public class TestMultiple {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=50/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(" task1 is completed");
		}
		catch(ArrayIndexOutOfBoundsException as)
		{
			System.out.println("task1 is completed");
		}
		catch(Exception e)
		{
			System.out.println("comman task is complted");
		}
		System.out.println("close the task"); 
		}

	}


