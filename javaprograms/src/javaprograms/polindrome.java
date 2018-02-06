package javaprograms;

import java.util.Scanner;

public class polindrome {

	public static void main(String[] args)
	{
		int n,n1,rev=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		n1=n;
		while(n!=0)
		{
			int rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		if(n1==rev)
		{
			System.out.println("polindrome");
		}
		else
		{
			System.out.println("not polindrome");
		}
	}
				
}