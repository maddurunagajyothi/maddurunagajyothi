package collections;

import java.util.Vector;

public class vector {

	public static void main(String[] args)
	{
		
      Vector v=new Vector();
       System.out.println(v.capacity());
       for(int i=0;i<=10;i++)
       {
    	   v.addElement(i);
       }
    	   System.out.println(v.capacity());
    	   v.addElement("A");
    	   v.add("s");
    	   v.add(1,"java");
    	   v.add("1");
    	   v.size();
    	   System.out.println(v.capacity());
    	   System.out.println(v);
       }

	}


