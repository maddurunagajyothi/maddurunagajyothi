package subi;

import java.util.ArrayList;
import java.util.*;
public class collectiontoarray {

	public static void main(String[] args)
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("this");
		l.add("is");
		l.add("a");
		l.add("good");
		l.add("program");
        String[] s=l.toArray(new String[0]);//String[] s1 = l.toArray(new String[0]);
        for(int i=0;i<=s.length;i++)
        {
        	String contents=s[i];
        	System.out.print(contents);
        }
	}

}
