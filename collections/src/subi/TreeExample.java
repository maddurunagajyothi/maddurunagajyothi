package subi;

import java.util.TreeMap;

public class TreeExample {

	public static void main(String[] args) 
	{
		System.out.println("tree example of a program");
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(1, "sunday");
		t.put(3,"monday");
		t.put(4, "tuesday");
		System.out.println("tree map of a value="+t.keySet());
		System.out.println("map values of= "+t.values());
		System.out.println("key 5 values="+t.get(5)+"\n");
		System.out.println("first key="+t.firstKey()+"value"+t.get(t.firstKey()));
        System.out.println("lastkey="+t.lastKey()+"value"+t.get(t.lastKey()));
        System.out.println("remove the values of="+t.remove(t.firstKey()));
        System.out.println("now the element of map keys="+t.keySet());
        System.out.println("now the element of map contains="+t.values());
        System.out.println("remove the last data="+t.remove(t.lastKey()));
        
        System.out.println("now the element of map keys="+t.keySet());
        System.out.println("now the element of map contains="+t.values());
      
	}

}
