package collections;
import java.util.*;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add(0,"er");
		l.add("jyothi");
		l.add("naga");
		l.add("a");
		l.add(1);
		l.set(0,"abc");
		System.out.println(l);
		l.removeLast();
		l.addFirst("prgm");
		l.add(1,"java");
		System.out.println(l);
		
	}

}
