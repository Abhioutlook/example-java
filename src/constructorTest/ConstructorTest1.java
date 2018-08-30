package constructorTest;

public class ConstructorTest1 {
	
	int id;  
    String name;  
    //creating a parameterized constructor  
    ConstructorTest1(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    	ConstructorTest1 s1 = new ConstructorTest1(111,"Karan");  
    	ConstructorTest1 s2 = new ConstructorTest1(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  

}
