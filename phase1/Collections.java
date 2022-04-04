package chaithanya.java.assignment.com;
	import java.util.*;
	public class Collections {

		public static void main(String[] args) {
			//creating arraylist
			System.out.println("ArrayList");
			ArrayList<String> city=new ArrayList<String>();   
		      city.add("hyderabad");//
		      city.add("Pune");    	   
		      System.out.println(city);  
			
			//creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(25); 
		      vec.addElement(30); 
		      vec.addElement(40); 
		      System.out.println(vec);
			
			//creating linkedlist
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("chaithanya");  
		      names.add("swetha");  	      
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       //creating hashset
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(101);  
		       set.add(103);  
		       set.add(102);
		       set.add(104);
		       System.out.println(set);
		       
		       //creating linkedhashset
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(21);  
		       set2.add(23);  
		       set2.add(22);
		       set2.add(24);	       
		       System.out.println(set2);
		      	} 
		      }  
		}

