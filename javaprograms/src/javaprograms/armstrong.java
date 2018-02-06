package javaprograms;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args)
	{
		int n,n1,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		n1=n;
		while(n!=0)
		{
			int rem=n%10;
			
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(n1==sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}

	}


