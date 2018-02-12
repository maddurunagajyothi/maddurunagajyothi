package collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo
{

	public static void main(String[] args)
	{
		ArrayList l=new ArrayList();
		int i;
		for(i=1;i<=10;i++);
		{
			l.add(i);
			l.add(i);
			//l.add(null);
			l.isEmpty();
			l.add(1);
			//l.add();
		}
		System.out.println(l);
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Integer I=(Integer)it.next();
			if(I%2==0)
			{
				System.out.println(I);
			}
			else
			{
				it.remove();
			}
			System.out.println(l);
		}
		
		}
}
