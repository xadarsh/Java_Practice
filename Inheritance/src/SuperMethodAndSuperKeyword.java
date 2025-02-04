/*
 * i) super() method:- Super() is present inside the constructor (explicitly or implicitly by JVM)
 * 					   to call and execute the parent class constructor then the child class constructor will execute.
 * 			Note- If we didn't write in the constructor then JVM include it implicitly(see in the below example)
 * 
 * ii) super keyword:- super keyword is used to call the parent class instance variable. 
 */

//Example-

class Parent1
{
	int age=18;
	Parent1()
	{
		System.out.println("Parent class constructor");
	}
}
class Childd1 extends Parent1
{
	int age=23;
	
	Childd1()
	{
		//super();			//Here I didn't write the super() but JVM will include it automatically
		System.out.println("Child class constructor");
	}
	
	public void disp()
	{
		System.out.println(age);// output- 23
		System.out.println(super.age);// output- 18 (super keyword will call the parent class age(instance variable))
	}
}
public class SuperMethodAndSuperKeyword {

	public static void main(String[] args) {
		
		Childd1 ch=new Childd1();
		
		ch.disp();

	}

}
