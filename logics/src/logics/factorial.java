package logics;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
    int n,f=1;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
   /* while(n!=0)
    {
    	f=f*n;
    	n=n-1;
    }*/
  //or//
    for(int i=1;i<=n;i++)
    {
    	f=f*i;
    }
    System.out.println("  "+f);
    
	}

}
