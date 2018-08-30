package classCloneExample;

public class ClassCloneTest implements Cloneable{
int rollno;
String name;

ClassCloneTest(int rollno, String name)
{
	this.rollno=rollno;
	this.name=name;
}

public Object clone()throws CloneNotSupportedException{
	return super.clone();
}
public static void main(String[] args)
{
	
try
{
	ClassCloneTest ct1=new ClassCloneTest(101,"Abhijit");
	ClassCloneTest ct2=(ClassCloneTest)ct1.clone();
	System.out.println(ct1.rollno+" "+ct1.name);  
	System.out.println(ct2.rollno+" "+ct2.name); 
	
}
catch(CloneNotSupportedException c)
{
	c.printStackTrace();
}
}
}
