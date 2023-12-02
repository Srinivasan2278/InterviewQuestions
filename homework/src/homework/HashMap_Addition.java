package homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_Addition {

	public static void main(String[] args) {
		    HashMap<String,Integer> hm = new HashMap<String,Integer>();	
	        hm.put("Tomatto",40);	
		    hm.put("Carrot",50);		
		    hm.put("beans",100);		
		    int sum = 0;		
		    Set<String> hs = hm.keySet();				
		    Iterator<String> i = hs.iterator();		
		    while(i.hasNext())		{		
		       // System.out.println(hm.get(i.next()));			
		        sum = sum + hm.get(i.next());		
		        
		    }	
		    System.out.println(sum);	
		    
		}

	}


