package S;

import java.util.*;
import java.util.Map.Entry;
public class Sample {
	public static void main(String[] args) {
		String s="Automation";
		char[] c = s.toCharArray();
		
		Map<Character,Integer>map= new LinkedHashMap<>();
		//map.put('a', 2)
		//map.put('u', 1)
		//map.put('t', 2)
		//map.put('o',2)
		//map.put('m',1)
		//map.put('i',1)

		  for(Character x:c ) {
			  if(map.containsKey(x)) {
				  Integer a = map.get(x);
				  map.put(x, a+1);
				  
				  
			  }
			  else {
				  map.put(x, 1);
			  }
			  
			  
		  }
		  System.out.println(map);
		 
	}

}
