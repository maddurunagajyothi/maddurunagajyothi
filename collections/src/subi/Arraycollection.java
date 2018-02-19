package subi;

import java.util.Scanner;
import java.util.*;

public class Arraycollection {

	public static void main(String[] args)
	{
	  Scanner s= new Scanner(System.in);
	  System.out.println("how many elements you want to this program");
	  int n=s.nextInt();
	  String[] ss=new String[n];
	  for(int i=0;i<n;i++)
	  {
		  ss[i]=s.nextLine();
	  }
	//  ArrayList al=new ArrayList();
	  List<String> list = Arrays.asList(ss); 
      System.out.println();
      
      for(String li: list) {
         String str = li;
         System.out.print(str + " ");
      }
   }
	  

	}


