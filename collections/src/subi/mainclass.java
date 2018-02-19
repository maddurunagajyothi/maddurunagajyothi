package subi;
import java.util.*;
import java.util.TreeSet;
import java.util.Set;
public class mainclass
{

	public static void main(String[] args)
	{
		String[] a= {"nani","rani"};
		Set s=new TreeSet();
		for(int i=0;i<a.length;i++)
		{
			s.add(a[i]);
			System.out.println(Collections.min(s));
			System.out.println(Collections.min(s,String.CASE_INSENSITIVE_ORDER));//CASE_INSENSITIVE_ORDER
			//System.out.println("==================================");
		}
			for(int i=0;i<=5;i++)
			{
				//System.out.println("============================");
				System.out.println('-');
				System.out.println(Collections.max(s));
				System.out.println(Collections.max(s,String.CASE_INSENSITIVE_ORDER));
			}
		     
		

	      }
	}

