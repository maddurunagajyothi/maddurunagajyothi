package javaprograms;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int i=1,f=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(i<=n)
		{
			
	      if(n%i==0)
	      {
	    	  f=f+1;
	      }
	      i=i+1;
		}
		if(f==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime");
		}

	}
}