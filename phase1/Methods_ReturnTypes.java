package chaithanya.java.assignment.com;

public class Methods_ReturnTypes {


	  int m1()
	  { 
	   System.out.println("m1 method") ;

	      return 20; 
	} 

	  float m2() 
	  { 
	    System.out.println("m2 method"); 
	      return 20.5f; 
	  } 

	  static char m3()
	  { 
	    System.out.println("m3 method"); 
	     return 'd'; 
	  } 
	double m4() 
	{
	System.out.println("m4 method"); 
	return 20.5d;
	}
	static String m5() 
	{
	  System.out.println("m5 method"); 
	    return "m5 method";

	}
	long m6() 
	{
	 System.out.println("m6 method"); 
	 return 1000000000;
	}
	public static void main(String[] args)
	 { 
	// Create an object of the class named Sample. 
		Methods_ReturnTypes s = new Methods_ReturnTypes();
	// Call m1() method using reference variable s. Since s.m1() is returning an integer value, we will store value by using a variable x with a data type int. 
	      int x = s.m1(); 
	// Now print the return value. 
	    System.out.println("Return value of m1()= " +x); 

	    float y = s.m2();
	    System.out.println("Return value of m2()= " +y); 

	// Call static method using the class name. Since m3() method returns character, we will store a character using a variable ch with type char. 
	    char ch = Methods_ReturnTypes.m3(); 
	    System.out.println("Return value of m3()= " +ch); 

	double d1 = s.m4() ;
	System.out.println("Return value of m4()= " +d1); 
	String str = s.m5() ;
	System.out.println("Return value of m5()= " +str); 

	long l = s.m6() ;
	System.out.println("Return value of m6()= " +l); 
	  } 
	 }