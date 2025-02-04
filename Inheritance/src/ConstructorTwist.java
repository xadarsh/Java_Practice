//Constructor is not directly involve in the inheritance but
//when we create the child class object and the child class const. is called by JVM
//then we know that the first line of a const. is super() or this() so
//when child class const. is called then super(); is also called then --> the parent class 
//const. is called automatically;
//Understand by the below example; and check the output

class ParentClass
{
	// (4) Now this const. will called by the child class const.
	ParentClass(){
		System.out.println("Parent class Constructor");
	}
	
	void disp()
	{
		System.out.println("Parent method");
	}
}
class Child extends ParentClass
{
	/* (2) in this chld class I didn't declear any constructor so JVM will create a default const.
		
		Child()
		{
			super(); // (3) from this super() the parent class const. will called and the 
							parent of this child class is ParentClass
		}
		
	*/
}


public class ConstructorTwist {

	public static void main(String[] args) {
			
		
		Child ch=new Child();//(1) Here Child class const. will called and then 
		
		ch.disp();

	}

}
