package collections;

import java.util.HashSet;

public class Iterator {

	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		h.add("a");
		h.add("abc");
		h.add(5);
		h.add(null);
		h.add("acv");
		h.remove("a");
		System.out.println(h.add("a"));
		System.out.println(h.add(null));
		System.out.println(h);
	//hash set insertion order is not preserved//	
	}

}
