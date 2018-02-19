package logics;

import java.util.Scanner;

public class Strongnumber
{

	public static void main(String[] args)
	{
 Scanner s=new Scanner(System.in);
 int num=s.nextInt();
 int i,f,n,r,sum=0,temp;
 temp=num;
 while(num!=0)
 {
	 f=1;
	 i=1;
	 r=num%10;
 
 while(i<=r)
 {
	 f=f*i;
	 i++;
 }
	 sum=sum+f;
	 num=num%10;
	}
	 if(sum==temp)
   
	   System.out.println("strong number");
   
   else
   
	   System.out.println("not strong number");
    
	}
}
   
	