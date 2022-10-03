package Question6;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	    public static String display(){
	    {
	   
	        Map<Integer, String> a
	            = new HashMap<Integer, String>();
	  
	        
	        a.put(100, "Ram");
	        a.put(101, "Sita");
	        a.put(102, "Ravan");
	        a.put(103,"Lakhman");
	        a.put(104,"Krishna");
	        a.put(105,"Ram");
	  
	
	   
	      System.out.println(a.get(102));
	      return a.get(102);
	        }
	    }}
	

