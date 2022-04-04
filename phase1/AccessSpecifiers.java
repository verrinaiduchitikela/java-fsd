package chaithanya.java.assignment.com;

public class AccessSpecifiers {

public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}

//create another package
class AccessSpecifiers4{

	public static void main(String[] args) {
		
	AccessSpecifiers obj = new AccessSpecifiers(); 
        obj.display();  
		
	}
}
//PRIVATE:
//2. using private access specifiers
class PriAccessSpecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
}
   class AccessSpecifiers2 {

	   public static void main(String[] args) {
			//private
   System.out.println("Private Access Specifier");
		PriAccessSpecifier  obj = new PriAccessSpecifier(); 
        //trying to access private method of another class 
        //obj.display();

	}

   }
//DEFAULT
//1. Class is having Default access modifier 
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

class accessSpecifiers1 {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 
	}
}

//:PROCTECTABLE:
//3. using protected access specifiers
class proaccessspecifiers {
protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

//create another package
class accessSpecifiers3 extends proaccessspecifiers {

	public static void main(String[] args) {
		accessSpecifiers3 obj = new accessSpecifiers3 ();   
	       obj.display();  
	}
}


