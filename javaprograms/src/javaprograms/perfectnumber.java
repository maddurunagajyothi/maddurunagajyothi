package javaprograms;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		int n,i,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==n)
			{
				System.out.println("perfect number");
			}
			else
			{
				System.out.println("not perfect");
			}
		

	}

}
