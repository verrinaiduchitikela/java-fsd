package chaithanya.java.assignment.com;

import java.util.*;  
public class MapExample1 {  
public static void main(String[] args) {  
    Map hm=new HashMap();  
    //Adding elements to map  
    hm.put(1,"Amit");  
    hm.put(5,"Rahul");  
    hm.put(2,"Jai");  
    hm.put(6,"Amit");  
    //Traversing Map  
    Set set=hm.entrySet();//Converting to Set so that we can traverse  
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
	      
    }  

    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue()); 
	       
	      } 
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(11,"Amit");  
	      ht.put(12,"Ravi");  
	      ht.put(13,"Vijay");  
	      ht.put(14,"Rahul");  
	      
	      for(Map.Entry m:ht.entrySet()){  
	       System.out.println(m.getKey()+" "+m.getValue());  
	      }  
	     }  
}
