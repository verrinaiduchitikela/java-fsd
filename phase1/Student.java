package chaithanya.java.assignment.com;
//PARAMETERIZED CONSTRUCTOR
class Student{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Student(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){
    	System.out.println(id+" "+name);
    	}  
   public static void main(String args[]){  
    //creating objects and passing values  
    Student s1 = new Student(111,"Karan");  
    Student s2 = new Student(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}

//NO-ARGUMENT CONSTRUCTOR
class Bike1{  
	//creating a no-argument constructor  
	Bike1(){
		System.out.println("Bike is created");
		}   
	public static void main(String args[]){  
	//calling a default constructor  
	Bike1 b=new Bike1();  
	}  
	}  
//Default constructor is by default added by the compiler