package chaithanya.java.assignment.com;


	import java.util.*; 
	import java.nio.charset.StandardCharsets; 
	import java.nio.file.*; 
	import java.io.*; 
	public class ReadFileIntoList { 
	  public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections(); 
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 
	  private static List<String> Collections() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) 
	  { 
	    List li = readFileInList("F:\\Assignment\\src\\chaithanya\\java\\assignment\\com"); 
	  
	    Iterator<String> itr = li.iterator(); 
	    while (itr.hasNext())
	      System.out.println(itr.next()); 
	
}
}