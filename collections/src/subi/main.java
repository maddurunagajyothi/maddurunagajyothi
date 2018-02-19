package subi;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;*/

import java.util.*;

public class main {

	public static void main(String[] args) 
	{
		List l=Arrays.asList(new String[] {"a","b","c","d"});
		List ll=new ArrayList(l);
		ll=Collections.unmodifiableList(ll);
		try
		{
			ll.set(1,"new value");
		}
     catch (UnsupportedOperationException e)
		{
    	 
        }
    Set set = new HashSet(l);
    set = Collections.unmodifiableSet(set);
    Map map = new HashMap();
    map = Collections.unmodifiableMap(map);
    System.out.println("Collection is read-only now.");
		
}
}
