package logics;

import java.util.Scanner;

public class fibnocci {

	public static void main(String[] args) {
		int a,b=0,c=1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println(" "+c);
			
			a=b;
			b=c;
			c=a+b;
		}

	}

}
